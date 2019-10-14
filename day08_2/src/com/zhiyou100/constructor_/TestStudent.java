package com.zhiyou100.constructor_;

public class TestStudent {

	public static void main(String[] args) {
		// Student s1 = new Student();
		Student s2 = new Student();
		System.out.println("得到名字"+s2.getName());
		System.out.println("得到年龄"+s2.getAge());
		System.out.println("-------------------");
		Student s3 = new Student();
		s3.setName("李四");
		System.out.println("得到名字"+s3.getName());
		System.out.println("得到年龄"+s3.getAge());
		
		// 利用 有参构造 创建对象
		
		Student s4 = new Student("王五", 21);
		System.out.println(s4.getAge()+"----"+s4.getName());
		
		Student s5 = new Student("赵六",23);
		System.out.println(s5.getAge()+"----"+s5.getName());
		
		
		Student s6 = new Student();
		System.out.println(s6.getName());
		
		// Student s5 = new Student(23);


	}

}
