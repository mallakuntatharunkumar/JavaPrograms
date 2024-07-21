package com;
import java.util.Scanner;
public class Practice2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		for(int i=1;i<=5;i++) {
			System.out.print("Enter number:");
			int n=s.nextInt();
			Practice1.EvenOrOdd(n);
		}
	}
	

}
