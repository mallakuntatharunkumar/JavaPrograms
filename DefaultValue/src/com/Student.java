package com;

class Student {
	String name;
	int marks;
	
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.name="Tharun";
		s1.marks=100;
		s2.name="Nani";
		s2.marks=99;
		System.out.println(s1.name+" "+s1.marks);
		System.out.println(s2.name+" "+s2.marks);
	}

}
