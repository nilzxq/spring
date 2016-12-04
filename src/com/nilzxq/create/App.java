package com.nilzxq.create;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	@Test
	public void getIoc(){
		ClassPathXmlApplicationContext beans = new ClassPathXmlApplicationContext("com/nilzxq/create/bean.xml");
//	    User user=(User)beans.getBean("user");
//	    System.out.println("user:"+user);
//	    User user1=(User)beans.getBean("user1");
//	    System.out.println("user1:"+user1);
//	    User user2=(User)beans.getBean("user2");
//	    System.out.println("use2:"+user2);
	    User user3=(User)beans.getBean("user3");
	    System.out.println("use3:"+user3);
	}
}
