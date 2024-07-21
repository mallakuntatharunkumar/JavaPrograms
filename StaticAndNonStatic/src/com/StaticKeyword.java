package com;
//Accesing static properties with in the class 
public class StaticKeyword {
	static int age = 20;
	
	static void study() {
		System.out.println("Student is studying");
	}
	 
	public static void main(String[] args) {
		System.out.println("Start");
		System.out.println(StaticKeyword.age);
		StaticKeyword.study();
		System.out.println("End");
	}
}
 