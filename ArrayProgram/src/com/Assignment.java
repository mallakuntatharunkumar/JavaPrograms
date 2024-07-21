package com;
import java.util.Scanner;
public class Assignment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size:");
		int x=sc.nextInt();
		int[] a = new int[x];
		for(int i=0;i<a.length;i++) {
			System.out.print("enter value "+i+":");
			int value = sc.nextInt();
			a[i]=value;
		}
		System.out.print("Enter serching element:");
		int search = sc.nextInt();
		int store=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==search)
			{
				store=store+1;
			}
		}
		System.out.println("Occurance of an element:"+store);
	}
}
