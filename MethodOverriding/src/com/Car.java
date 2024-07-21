package com;

public class Car extends Vehical {
	@Override
	void start() {
		super.start();
		System.out.println("Car started");
	}
	void shiftGears() {
		System.out.println("Geras shifted");
	}
	

}
