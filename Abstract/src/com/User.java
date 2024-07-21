package com;

public class User extends Car {
	@Override
	void start() {
		System.out.println("Car started ");
	}
	@Override
	void stop() {
		System.out.println("Car stopped");
	}
	public static void main(String[] args) {
		User u = new User();
		u.stop();
		u.start();
		Vehical.shiftGears();
	}
}
