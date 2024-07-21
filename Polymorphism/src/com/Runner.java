package com;

public class Runner {
	public static void main(String[] args) {
		Employee e = new Developer();
		e.work();
		
		Employee emp;
		emp =new Developer();
		emp.work();
		emp = new Tester();
		emp.work();
	}
}
