package com;

import java.util.Scanner;

public class Dup {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter name:");
		String s=sc.nextLine();
		System.out.println("Enter search element:");
		char search=sc.next().charAt(0);
		 char s1;
		int count=0;
		for(int i=0;i<s.length();i++) {
			s1=s.charAt(i);
		if(s1==search) {
			count++;
			}
		}
		System.out.println(search+":"+count);
	}
}