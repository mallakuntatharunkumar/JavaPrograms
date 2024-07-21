package com;
import java.util.Scanner;
public class Test2 {
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter size:");
		int x = sc.nextInt();
		int[] a = new int[x];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter value:");
			int y = sc.nextInt();
			a[i]=y;
			//System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}
	
}
