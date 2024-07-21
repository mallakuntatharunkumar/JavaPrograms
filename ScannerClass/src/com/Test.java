package com;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("enter A value:");
		int a = scan.nextInt();
		
		System.out.print("Enter B value:");
		int b = scan.nextInt();
		
		System.out.println("Sum of the a and b is "+(a+b));
		scan.close();
		
	}

	
}
