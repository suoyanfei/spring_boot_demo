/*package com.syf.activemq;

import javax.jms.Destination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class producer {
	
	
	*//**
	 * spring 提供的操作activemq 封装的类
	 *//*
	@Autowired
	private JmsMessagingTemplate jmsTemplate;
	
	*//**
	 * 
	 * @param destination 发送的队列名称  接受端根据这个名称来监听接受  
	 * @param msg 发送的消息
	 *//*
	public void sendMsg(String msg) {
		//发送消息
		jmsTemplate.convertAndSend("itcast", msg);
	}

}
*/