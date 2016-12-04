package com.nilzxq.create;

public class ObjectFactory {

	//非静态工厂方法创建对象
	public User getUser(){
		System.out.println("非静态工厂方法创建对象");
		return new User(22,"xue222");
	}
	//静态工厂方法创建对象
	public User getStaticUser(){
		System.out.println("静态工厂方法创建对象");
		return new User(22,"xue222");
	}
}
