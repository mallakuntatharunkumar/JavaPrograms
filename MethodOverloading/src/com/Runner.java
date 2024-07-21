package com;

public class Runner {
	public static void main(String[] args) {
		
		OverLoading1 mo1 = new OverLoading1();
		mo1.display(45);
		mo1.display(12,"java");
		mo1.display(45.65);
		mo1.display("eclipse",789);
		int res=mo1.display(10,13);
		System.out.println(res);
	}
	  
}
