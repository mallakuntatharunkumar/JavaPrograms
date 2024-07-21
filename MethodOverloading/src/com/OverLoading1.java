package com;

public class OverLoading1 {
	void display(){
		System.out.println("hello");
	}
	
	void display(int x){
		System.out.println(x);
	}
	
	void display(double x) {
		System.out.println(x);
	}
	
	void display(int x,String y) {
		System.out.println(x+" "+y);
	}
	
	void display( String x, int y) {
		System.out.println(x+" "+y);
	}
	
	int display(int x, int y) {
		return x+y;
	}

}
