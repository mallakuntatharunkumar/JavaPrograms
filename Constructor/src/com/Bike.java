package com;

public class Bike {
	//Parameterized custom constructor 
	Bike(int cost){
		System.out.println("cost: "+cost);
	}
	
	public static void main(String[] args) {
		Bike b = new Bike(10);
	}

}
