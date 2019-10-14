package com.zhiyou100.extends_;

public class Animal extends Cell{
	int age;// 寿命
	String color; // 
	
	void eat(){
		System.out.println("Animal 吃");
	}
	
	// 父类的  无参构造
	public Animal() {
		System.out.println();
	}
}
   