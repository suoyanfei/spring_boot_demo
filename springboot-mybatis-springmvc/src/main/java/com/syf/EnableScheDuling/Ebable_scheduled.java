package com.syf.EnableScheDuling;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class Ebable_scheduled {
	
	private int count = 1;
	private int count2 = 1;
	/*@Scheduled(fixedRate=1000)
	public void data() {
		System.out.println("没秒执行一次[定时器A]"+count++);
	}
	@Scheduled(fixedRate=1000)
	public void dat2() {
		System.out.println("没秒执行一次[定时器B]"+count2++);
	}*/
     
	/**
	 * cron的通配符有6-7的素  分别是 秒 分 时 天 月 星期 年
	 * 其中 ?  *表示任意值 而？不指定任何值 因为天和 星期会产生冲突   所以只是区分天和星期  
	 */
	@Scheduled(cron="0 0 16 * * ?")
	public void dat2() {
		System.out.println("每天下午4点整执行[定时器]"+count2++);
	}
	@Scheduled(cron="0 30 15 * * ?")
	public void dat1() {
		System.out.println("每天下午3点半整执行[定时器]"+count2++);
	}
	@Scheduled(cron="0 35 15 * * ?")
	public void dat3() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = sdf.format(d);
		
		System.out.println("每天下午3点半整执行[定时器]"+count2+++"时间是"+format);
	}
}
