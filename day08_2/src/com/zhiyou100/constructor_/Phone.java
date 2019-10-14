package com.zhiyou100.constructor_;

public class Phone {
	// 创建手机类
	// 封装属性   提供set get 方法
	// 根据属性提供有参无参构造
	// 创建对象
	//    利用无参有参的构造方法创建
	private String color;
	private double price;
	private String brand;
	public Phone() {
		System.out.println("这是无参构造方法");
	}
	public Phone(String color , double price , String brand) {
		this.color = color;
		this.price = price;
		this.brand = brand;
		System.out.println("有参构造方法 :"+color);
		System.out.println("有参构造方法 :"+price);
		System.out.println("有参构造方法 :"+brand);
	}
	public Phone(String brand ,String color , double price) {
		this.color = color;
		this.price = price;
		this.brand = brand;
		System.out.println("有参构造方法 :"+color);
		System.out.println("有参构造方法 :"+price);
		System.out.println("有参构造方法 :"+brand);
	}
	public Phone(double price , String color , String brand) {
		this.color = color;
		this.price = price;
		this.brand = brand;
		System.out.println("有参构造方法 :"+color);
		System.out.println("有参构造方法 :"+price);
		System.out.println("有参构造方法 :"+brand);
	}
	public Phone(String brand , double price) {
		this.color = color;
		this.price = price;
		this.brand = brand;
		System.out.println("有参构造方法 :"+color);
		System.out.println("有参构造方法 :"+price);
		System.out.println("有参构造方法 :"+brand);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return this.color;
	}
}
