package com;

public class Student {
	String name;
	public Student(String name) {
		this.name = name;
	}
	public String toString() {
		return "Name: "+name;
	}
	public static void main(String[] args) {
		Student s1 = new Student("Tom");
		Student s2 = new Student("Jerry");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
}
