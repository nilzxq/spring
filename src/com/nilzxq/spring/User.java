package com.nilzxq.spring;

public class User {

	private Integer id;
	private String name;
	public User(){
        System.out.println("user被实例化了！"); 
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void init_user(){
		System.out.println("对象被初始化！");
	}
	public void dest_user(){
		System.out.println("对象被销毁了！");
	}
}
