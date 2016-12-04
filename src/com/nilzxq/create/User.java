package com.nilzxq.create;

public class User {


	private Integer id;
	private String name;
	public User(){
		System.out.println("无参构造函数被创建！");
	}
	public User(Integer id,String name){
		System.out.println("有参构造函数被创建，id:="+id+"----name"+name);
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
	
}
