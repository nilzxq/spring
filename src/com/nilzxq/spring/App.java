package com.nilzxq.spring;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class App {
	@Test
	public void testIoc(){
		//思考问题，怎样实例化User类
		//User user=new User();
		//1.加载spring相关配置文件，把对象交给spring的IOC容器来管理
		ClassPathResource classPathResource = new ClassPathResource("com/nilzxq/spring/application.xml");
	    //2.得到对象工厂
		XmlBeanFactory xmlBeanFactory=new XmlBeanFactory(classPathResource);
	   User user=(User)xmlBeanFactory.getBean("user");
	   System.out.println(user);
	}
	/**
	 * 较上面一种更简单，更常用
	 *  
	 * 2016年12月4日
	 */
	@Test
	public void testAc(){
		//1.加载spring相关配置文件，把对象交给spring的IOC容器来管理，并得到对象工厂
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("com/nilzxq/spring/application.xml");
	    User user=(User)classPathXmlApplicationContext.getBean("user");
	    System.out.println("testAc:"+user);
	}
}
