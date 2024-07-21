package com;

public class Square {
	int findSquare (int n) {
		return n*n;
	}
	public static void main(String[] args) {
		Square s = new Square();
		 int result = s.findSquare(5);
		 System.out.println(result);
		 
		 System.out.println(s.findSquare(4));
	}
}
