package com;

public class AadharCard {
	private static AadharCard a;
	
	private AadharCard() {
		System.out.println("Aadhar object is created");
	}
	public static void createAadharObject() {
		 if(a==null) {
			 System.out.println(a);
			a = new AadharCard();
			System.out.println(a);
		}
	}
}
