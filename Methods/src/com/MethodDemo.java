package com;

public class MethodDemo {
	//Method wihtout arguments and without return statement
	void display()
	{
		System.out.println("Hello World");
	}
	public static void main(String[] args) {
		System.out.println("Start");
		MethodDemo m = new MethodDemo();
		m.display();// calling or invoking then method
		System.out.println("end");
	}
}
