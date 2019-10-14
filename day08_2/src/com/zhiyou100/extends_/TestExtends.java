package com.zhiyou100.extends_;

public class TestExtends {

	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		// 调用父类的属性                                                                                       
		d1.age = 2;
		d1.color = "黄色";
		System.out.println("寿命 : "+d1.age+", 颜色  :"+d1.color);
		// 调用父类的方法
		d1.eat();
		// 多层次继承.孙子类dog,可以访问祖父类
		d1.DNA = "sagsdgdsgds";
		System.out.println("父类的父类"+d1.DNA);
		System.out.println("---------------------------");
		// 调用子类特有属性
		d1.name = "大黄";
		// 创建父类对象
	}

}
