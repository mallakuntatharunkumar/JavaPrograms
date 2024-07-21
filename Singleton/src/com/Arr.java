package com;

import java.util.Scanner;

public class Arr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of an array:");
		int l = sc.nextInt();
		int[] a = new int[l];
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println("Enter num: " + i);
			int inp = sc.nextInt();
			a[i] = inp;
		}

		int count = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
				
			}
			System.out.print(a[i]+":"+count+" ");
			count=0;
		}
		

	}
}
