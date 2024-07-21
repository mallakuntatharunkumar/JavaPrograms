package com;

public class Demo2 {
	public static void main(String[] args) {
		int[] a= {10,20,30};
		try {
			System.out.println(a[99]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]);
			}
			System.out.println("the length is "+a.length+" more than this can not access");
		}
	}
}
