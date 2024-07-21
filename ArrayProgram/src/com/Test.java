package com;

public class Test {
	public static void main(String[] args) {
		int[] a = {10,20,30};
		int sum=0;
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			sum=sum+a[i];
		}
		System.out.println("Sum:"+sum);
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		
	}  
}
