package com;
import java.util.*;
public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value a:");
		int a=sc.nextInt();
		System.out.println("Enter value b:");
		int b=sc.nextInt();
		sc.close();
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println("Enter valid denominator");
		}
		
		
		
	}
}
