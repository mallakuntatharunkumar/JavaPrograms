package com;

public class Car {
	// Non-Parameterised customized constructor
	Car(){
		System.out.println("hi");
	}
	public static void main(String[] args) {
		System.out.println("Start");
		Car c = new Car();
		System.out.println("End");
	}
}
