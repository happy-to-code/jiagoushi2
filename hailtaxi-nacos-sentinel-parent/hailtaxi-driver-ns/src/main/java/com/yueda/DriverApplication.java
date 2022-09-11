package com.yueda;

import com.alibaba.cloud.nacos.ribbon.NacosRule;
import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.RequestOriginParser;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.authority.AuthorityRule;
import com.alibaba.csp.sentinel.slots.block.authority.AuthorityRuleManager;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRule;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRuleManager;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowItem;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowRuleManager;
import com.netflix.loadbalancer.IRule;
import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.yueda.driver.mapper")
@EnableAutoDataSourceProxy
public class DriverApplication {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(DriverApplication.class, args);
		
		// while (true) {
		// 	//当动态配置刷新时，会更新到 Enviroment中，
		// 	String name = applicationContext.getEnvironment().getProperty("app.name");
		// 	System.out.println("app.name=" + name);
		// 	try {
		// 		TimeUnit.SECONDS.sleep(5); // 每隔5秒中从Enviroment中获取一下
		// 	} catch (InterruptedException e) {
		// 		e.printStackTrace();
		// 	}
		// }
	}
	
	
	/***
	 * Nacos负载均衡算法
	 * @return
	 */
	@Bean
	@Scope(value = "prototype") // 注意不要单例 https://github.com/alibaba/spring-cloud-alibaba/issues/1184
	public IRule loadBalanceRule() {
		return new NacosRule();
	}
	
	
	/***
	 * 初始化规则
	 */
	// @PostConstruct
	private void initFlowRule() {
		// 规则集合
		List<FlowRule> rules = new ArrayList<FlowRule>();
		// 定义一个规则
		FlowRule rule = new FlowRule("info");
		// 设置阈值
		rule.setCount(2);
		//设置限流阈值类型
		rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
		// default，代表不区分调用来源
		rule.setLimitApp("default");
		// 设置流控效果
		rule.setControlBehavior(RuleConstant.CONTROL_BEHAVIOR_DEFAULT);
		//将定义的规则添加到集合中
		rules.add(rule);
		// 加载规则
		FlowRuleManager.loadRules(rules);
	}
	
	// @PostConstruct
	public void initDegradeRule() {
		List<DegradeRule> rules = new ArrayList<>();
		DegradeRule rule = new DegradeRule();
		// 设置资源名称
		rule.setResource("info");
		/**
		 * 设置熔断策略
		 * DEGRADE_GRADE_RT:平均响应时间
		 * DEGRADE_GRADE_EXCEPTION_RATIO:异常比例数量
		 * DEGRADE_GRADE_EXCEPTION_COUNT:异常数
		 */
		rule.setGrade(RuleConstant.DEGRADE_GRADE_EXCEPTION_COUNT);
		// 设置阈值
		rule.setCount(2);
		// 设置 熔断时长
		rule.setTimeWindow(30);
		// 统计时长（单位为 ms） 默认1000
		rule.setStatIntervalMs(60 * 1000);
		// 将规则添加到集合中
		rules.add(rule);
		DegradeRuleManager.loadRules(rules);
	}
	
	
	// @PostConstruct
	public void initAuthorityRule() {
		AuthorityRule rule = new AuthorityRule();
		rule.setResource("info");
		rule.setStrategy(RuleConstant.AUTHORITY_WHITE);
		rule.setLimitApp("127.0.0.1,appB"); // 可以访问的IP地址（白名单）
		AuthorityRuleManager.loadRules(Collections.singletonList(rule));
	}
	
	/**
	 * Sentinel提供了 RequestOriginParser 接口来处理访问来源，Sentinel保护的资源如果被访问，
	 * 就会调用 RequestOriginParser解析访问来源
	 */
	// @Component
	public class IpLimiter implements RequestOriginParser {
		@Override
		public String parseOrigin(HttpServletRequest httpServletRequest) {
			return httpServletRequest.getRemoteAddr();
		}
	}
	
	
	/***
	 * 热点参数初始化
	 */
	// @PostConstruct
	private static void initParamFlowRules() {
		ParamFlowRule rule = new ParamFlowRule("search")
				//参数下标为0
				.setParamIdx(0)
				//限流模式为QPS
				.setGrade(RuleConstant.FLOW_GRADE_QPS)
				//统计窗口时间长度（单位为秒）
				.setDurationInSec(10)
				//流控效果（支持快速失败和匀速排队模式）
				//CONTROL_BEHAVIOR_DEFAULT：限流行为，直接拒绝
				//CONTROL_BEHAVIOR_WARM_UP:限流行为，匀速排队
				//CONTROL_BEHAVIOR_RATE_LIMITER：限流行为，匀速排队
				.setControlBehavior(RuleConstant.CONTROL_BEHAVIOR_DEFAULT)
				//最大排队等待时长（仅在匀速排队模式生效  CONTROL_BEHAVIOR_RATE_LIMITER）
				//.setMaxQueueingTimeMs(600)
				//最大阈值为5
				.setCount(5);
		
		// 为特定参数单独设置规则
		//如下配置：当参数值为恩施的时候，阈值到达2的时候则执行限流
		ParamFlowItem item = new ParamFlowItem()
				//参数类型为String类型
				.setClassType(String.class.getName())
				//设置阈值为2
				.setCount(2)
				//需要统计的值
				.setObject(String.valueOf("苏州"));
		rule.setParamFlowItemList(Collections.singletonList(item)); //返回的是不可变的集合，但是这个长度的集合只有1，可以减少内存空间
		//加载热点数据
		ParamFlowRuleManager.loadRules(Collections.singletonList(rule));
	}
}
