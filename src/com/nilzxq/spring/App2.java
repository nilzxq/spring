package com.nilzxq.spring;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
	/**
	 * 对象创建：单例，多例
	 * 默认springbean是单例
	 * scope="prototype" 设置bean多例
	 * scope="singleton" 设置bean为单例
	 *  什么时候创建？
	 *  如果bean设置为单例，会在加载配置文件后，直接初始化bean
	 *  如果bean设置为多例，会在调用getbean方法时，初始化bean
	 *  如果bean设置lazy-init="ture"会在调用getbean方法时去创建
	 * 2016年12月4日
	 */
@Test
	public void testIoc(){
	System.out.println("开始读取配置文件");
		//1.得到Ioc容器,销毁必须要手动销毁...
		ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext(
				"com/nilzxq/spring/application.xml");
		System.out.println("读取配置文件结束");
	   User user=(User)classPathXmlApplicationContext.getBean("user");
       User user1=(User)classPathXmlApplicationContext.getBean("user");
       System.out.println("user1:"+user);
       System.out.println("user2:"+user1);
       //手动调用销毁bean方法
       classPathXmlApplicationContext.destroy();
	}
}
