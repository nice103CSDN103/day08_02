package com.zhiyou100.constructor_;

public class TestPhone {

	public static void main(String[] args) {
		Phone p1 = new Phone("小米" , 1000 ,"黑色");
		Phone p2 = new Phone();
		p2.setColor("黑色");
		String result = p2.getColor();
		System.out.println(result);
	}

}
