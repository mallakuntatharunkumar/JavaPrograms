package com;

public class Runner {
	void m1(){
		System.out.println("I am tharun kumar");
	}
	void m2(int a, int b){
		System.out.println(a+b); 
	}
	int m3(){
		return 10;
	}
	 int m4(int n){
		 return n*n;
	 }

	public static void main(String[] args) {
		Runner r = new Runner();
		r.m1();
		r.m2(2,9);
		int res = r.m3();
		System.out.println(res);
		int result= r.m4(10);
		System.out.println(result);
	}
}
