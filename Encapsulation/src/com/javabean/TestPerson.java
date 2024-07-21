package com.javabean;

public class TestPerson {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.setAge(25);
		int a = p.getAge();
		System.out.println("Age:"+a);
		//direct accesing the data 
		System.out.println(p.getAge());
		
	}
}
