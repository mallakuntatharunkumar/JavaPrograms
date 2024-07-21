package com;
import java.util.Scanner;
public class Employee {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter age:");
		int age=s.nextInt();
		
		System.out.print("Enter name:");
		String name = s.next();
		
		System.out.print("Enter Salary:");
		double salary = s.nextDouble();
		System.out.println("---------------");
		System.out.println("Age:"+age+"\nName:"+name+"\n20Salary:"+salary);
		}
}
 