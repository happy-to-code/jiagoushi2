package com.yueda;

import com.alibaba.cloud.nacos.ribbon.NacosRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class GatewayApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
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
}