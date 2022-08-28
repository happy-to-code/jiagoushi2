package com.yueda;

import com.alibaba.cloud.nacos.ribbon.NacosRule;
import com.netflix.loadbalancer.IRule;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.yueda.driver.mapper")
public class DriverApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DriverApplication.class, args);
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
