/*package com.syf.security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class SecuriConfig extends WebSecurityConfigurerAdapter {
   *//**
    * 授权验证服务
    *//*
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//密码加密的类 
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		auth.inMemoryAuthentication().
		passwordEncoder(passwordEncoder).//设置密码编译器
		withUser("suoyanfei").//注册用户
		password("123").//设置密码
		roles("user","admin").//注册角色
		and().        //创建多个用户直接的连接
		withUser("user").//注册另一个用户
		password("123").
		roles("user");
		
	}
	
	
	
	

}
*/