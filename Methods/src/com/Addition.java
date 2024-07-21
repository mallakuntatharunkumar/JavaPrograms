package com;

public class Addition 
{ 
	/* Method with arguments and without return statement*/
	void add(int a, int b) {
		int sum=a+b;
		System.out.println("sum of "+a+" & "+b+" is "+(a+b));
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Addition a = new Addition();
		a.add(2,3);
		a.add(10,20);
		a.add(25,10);
		a.add(26,14);
	}
}
