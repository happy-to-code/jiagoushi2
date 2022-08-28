package com.yueda.order.config;

import com.yueda.driver.feign.interceptor.MyRequestInterceptor;
import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InterceptorConfiguration {
	
	
	@Bean
	public RequestInterceptor interceptor() {
		return new MyRequestInterceptor();
	}
}
