package com;
import java.util.Scanner;
public class Assignment2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int x = sc.nextInt();
		int[] a = new int[x];
		int temp =0;
		for(int i=0;i<a.length;i++) {
			int b=sc.nextInt();
			a[i]=b;
		}
		
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}	
			}
		}
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		}
	}

}
