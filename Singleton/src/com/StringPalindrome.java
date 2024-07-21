package com;

import java.util.Scanner;
public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter:");
		String n=sc.nextLine();
		String s="";
		
		for(int i=n.length()-1;i>=0;i--) {
			s+=n.charAt(i);
		}
		
		if(n.equals(s)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a plaindrome");
		}
		
	}
}
