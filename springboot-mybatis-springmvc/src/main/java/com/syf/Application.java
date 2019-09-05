package com.syf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@SpringBootApplication
@MapperScan(basePackages= {"com.syf.mapper"})

public class Application  {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

