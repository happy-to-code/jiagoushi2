package com.yida;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import java.io.File;

@SpringBootApplication(scanBasePackages = {"com.yida"})
@EnableAsync
@MapperScan("com.yida.mapper")
public class StartApplication {
	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
		
		String projectPath = System.getProperty("user.dir");
		String filePath = projectPath + "\\file111";
		System.out.println("filePath = " + filePath);
		File file = new File(filePath);
		// 如果文件夹不存在则创建
		if (!file.exists() && !file.isDirectory()) {
			file.mkdirs();
		}
	}
}
