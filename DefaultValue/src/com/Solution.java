package com;

public class Solution {
	public static void main(String[] args) {
		//Creating an object for an class
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		//Re-Initialising the values to the variables
		e1.id=101;
		e2.id=102;
		e3.id=104;
		//------ID is initialised------
		e1.name="Tharun";
		e2.name="Nani";
		e3.name="Bablu";
		//-----Name is initialised-----
		e1.salary=55000.57;
		e2.salary=77600.45;
		e3.salary=87000.29;
		
		System.out.println("Employee 1 Detils");
		System.out.println();
		System.out.println("ID:"+e1.id);
		System.out.println("Name:"+e1.name);
		System.out.println("Salary:"+e1.salary);
		System.out.println("------------------------");
		System.out.println("Employee 2 Details");
		System.out.println("ID:"+e2.id);
		System.out.println("Name:"+e2.name);
		System.out.println("Salary:"+e2.salary);
		System.out.println("------------------------");
		System.out.println("Employee 3 Details ");
		System.out.println("ID:"+e3.id);
		System.out.println("Name:"+e3.name);
		System.out.println("Salary:"+e3.salary);
		System.out.println("------------------------");
		
	}
}
