package com;

public class MainMethodOverLoading {
	public static void main(String[] args) {
		System.out.println("Start");
		main(10);
		System.out.println(main(12.23));
		System.out.println("End");
	}
	public static void main(int a) {
		System.out.println(a);
	}
	public static double main( double b) {
		return b;	
		}
}
