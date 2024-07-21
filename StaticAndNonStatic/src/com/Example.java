package com;

public class Example {
	static int cost=10;
	public static void main(String[] args) {
		System.out.println(cost);//Example.cost
		Example.cost=20;//Example.cost=20  Reinitialising the cost in the same class
		System.out.println(cost);
	}

}
