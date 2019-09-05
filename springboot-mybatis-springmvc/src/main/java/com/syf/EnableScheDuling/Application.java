package com.syf.EnableScheDuling;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
/**
 * 定时器要在定时的类上加 @Scheduled注解 指定定时的规则
 * 要在启动类上加 @EnableScheduling 启动定时任务
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableScheduling
public class Application  {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

