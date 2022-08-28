package com.yueda.driver.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.system.SystemBlockException;
import com.sun.deploy.security.BlockedException;
import com.yueda.driver.model.Driver;
import com.yueda.driver.service.DriverService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@RestController
@RequestMapping(value = "/driver")
@Slf4j
@RefreshScope
@SentinelResource(defaultFallback = "defaultExHandler")
public class DriverController {
	
	@Autowired
	private DriverService driverService;
	@Value("${app.name}")
	private String name;
	
	public Driver defaultExHandler(Throwable e) {
		Driver driver = new Driver();
		driver.setName("defaultExHandler,系统繁忙,稍后再试");
		return driver;
	}
	
	/****
	 * 司机信息
	 */
	// @SentinelResource(value = "info", fallback = "exHandler")
	@SentinelResource(value = "info")
	@GetMapping("/info/{id}")
	public Driver info(@PathVariable(value = "id") String id) throws BlockException {
		Driver driver = driverService.findById(id);
		if (driver == null) {
			// throw new SystemBlockException("司机id:" + id + " 不存在",null);
			throw new RuntimeException("司机id:" + id + " 不存在");
		}
		return driver;
	}
	
	/**
	 * info资源出现任何类型异常后的降级处理  法参数可以添加一个Throwable 类型的参数，也可不添加
	 * @param id
	 * @param e
	 * @return
	 */
	public Driver exHandler(String id, Throwable e) {
		Driver driver = new Driver();
		driver.setId(id);
		driver.setName("系统繁忙,稍后再试");
		return driver;
	}
	
	/**
	 * 出现错误走降级方法
	 *
	 * @param id
	 * @param e
	 * @return
	 */
	public Driver blockExceptionHandler(String id, BlockException e) {
		Driver driver = new Driver();
		driver.setId(id);
		driver.setName("系统繁忙,稍后再试");
		return driver;
	}
	
	
	/****
	 * 司机信息
	 */
	@GetMapping(value = "/info2/{id}")
	public Driver info2(@PathVariable(value = "id") String id, HttpServletRequest request) {
		Enumeration<String> headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String name = headerNames.nextElement();
			String value = request.getHeader(name);
			System.out.println(name + ":" + value);
			System.out.println("--------------------------");
		}
		System.out.println("port = " + port);
		System.out.println("name = " + name);
		return driverService.findById(id);
	}
	
	@Value("${server.port}")
	private int port;
	
	/****
	 * 更新司机信息
	 */
	@PutMapping(value = "/status/{id}/{status}")
	public Driver status(@PathVariable(value = "id") String id, @PathVariable(value = "status") Integer status) {
		log.info("当前服务占用的端口为:{}", port);
		//修改状态
		driverService.update(id, status);
		//修改状态后的司机信息
		return driverService.findById(id);
	}
}
