package com;

public class Employee {
	int id;
	String name;
	double salary;
	
	Employee(int i ,String name ,double salary){
		this.id = i;
		this.name=name;
		this.salary= salary;
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Tommy",250000.67);
		Employee e2 = new Employee(102,"Jerry",150000.34);
		System.out.println("----Empoyeee Details----");
		
		System.out.println("Employe Id: "+e1.id);
		System.out.println("Employe Name: "+e1.name);
		System.out.println("Employe Salary: "+e1.salary);
		
		System.out.println("---------------------------");
		
		System.out.println("Employe Id: "+e2.id);
		System.out.println("Employe Name: "+e2.name);
		System.out.println("Employe Salary: "+e2.salary);
				
	}
	
	
}
