package com;

public class Student1 {
	int id;
	String name;
	public Student1(int id,String name) {
		this.id=id;
		this.name= name;
	}
	public String toString() {
		return "Employee id is "+id+" And Name is "+name;
	}
	public static void main(String[] args) {
		Student1 s1 = new Student1(101,"Tom");
		Student1 s2 = new Student1(102,"Jerry");
		Student1 s3 = new Student1(103,"Nani");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
