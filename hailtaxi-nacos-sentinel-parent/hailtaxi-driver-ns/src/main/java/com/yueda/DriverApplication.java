package com.yueda;

import com.alibaba.cloud.nacos.ribbon.NacosRule;
import com.netflix.loadbalancer.IRule;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.yueda.driver.mapper")
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
}
