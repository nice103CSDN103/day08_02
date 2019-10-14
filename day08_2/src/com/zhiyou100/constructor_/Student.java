package com.zhiyou100.constructor_;

public class Student {
	
	// 属性: 对象属性
	private String name;
	private int age;
	
	/*
	 * 构造方法
	 */
//	public Student() {
//		// 给对象属性赋值 
//		this.name = "张三";
//		this.age = 18;
//		System.out.println("无参构造方法成功!");
//	}
	
	// 两个参数
	public Student(String name , int age) {
		this.name = name;
		this.age = age;
		System.out.println("有参构造方法 执行了");
	}
	
	public Student(int age ,String name) {
		this.name = name;
		this.age = age;
		System.out.println("有参构造方法 执行了");
	}
	
	// 无参构造
	public Student() {
		this.name = name;
		this.age = age;
		System.out.println("有参构造方法 执行了");
	}
	public Student(int age) {
		// this.name = name;
		this.age = age;
		System.out.println("有参构造方法 执行了");
	}
	public Student(String name) {
		this.name = name;
		// this.age = age;
		System.out.println("有参构造方法 执行了");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 提供set方法 为属性赋值
	public void setName(String name) {
		this.name = name;
	}
	// 提供get方法 获取属性值
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
}
