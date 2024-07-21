package com;

import java.util.Scanner;

public class Practice {
	static int km;
	static int distance(int k) {
		return km*km;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for( int i =1 ;i<=5;i++)
		{
			System.out.println("Enter km value");
			int k=sc.nextInt();
			Practice.km=k;
			System.out.println(distance(km));
		}		
	}
	
}
