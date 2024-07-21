package com;

public class Employeee {
	int id;
	String name;
	double salary;
	
	Employeee(int id ,String name ,double salary){
		this.id = id;
		this.name=name;
		this.salary= salary;
	}
	
	void display() {
		System.out.println("Employe Id: "+this.id);
		System.out.println("Employe Name: "+this.name);
		System.out.println("Employe Salary: "+salary);//this.salary
	}
	
	public static void main(String[] args) {
		Employeee e1 = new Employeee(101,"Tommy",250000.67);
		Employeee e2 = new Employeee(102,"Jerry",150000.34);
		e1.display();
		e2.display();
	}
}
