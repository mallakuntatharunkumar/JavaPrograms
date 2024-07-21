package com;

public class Demo {
	public static void main(String[] args) {
		//Array Decloration
		int[] a;
		//Array creation
		a= new int[3];
		
		//Array elements
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		System.out.println("____________");
		
		//Array Initialization
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		//Array decloration and creation
		double[] x = new double[4];
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		
		System.out.println("____________________");
		
		x[0]=20.4;
		x[1]=234.4;
		x[2]=44.4;
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		
		System.out.println("Length:"+x.length);
		
	}
}
