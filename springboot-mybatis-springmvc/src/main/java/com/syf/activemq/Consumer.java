/*package com.syf.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
   //destination 就是指的队列名称 要监听那个队列
	@JmsListener(destination="itcast")
	public void reciveMsg(String msg) {
		System.out.println("接受到的消息是:----"+msg);
	}

}
*/