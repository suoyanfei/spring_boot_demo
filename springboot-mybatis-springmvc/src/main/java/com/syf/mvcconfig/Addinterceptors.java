package com.syf.mvcconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
public class Addinterceptors extends WebMvcConfigurerAdapter {

	
	//通过继承 WebMvcConfigurerAdapter 接口的方法 addInterceptors来注册我们自定义的拦截器
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new MyInterceptors())
		.addPathPatterns("/**");//拦截所有的请求
	}
	
	

}
