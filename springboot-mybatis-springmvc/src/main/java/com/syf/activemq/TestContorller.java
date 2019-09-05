/*package com.syf.activemq;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestContorller {
	
	private producer producerService;
	@RequestMapping("/senMsg")
	public String senMsg() {
		ActiveMQQueue myQuque = new ActiveMQQueue("myQuque");
		producerService.sendMsg("hello");
		return "ok";
	}

}
*/