package com;

public class Test {
	public static void main(String[] args) {
		Son s= new Son();
		Daughter d = new Daughter();
		Father f= new Father();
		
		System.out.println(s instanceof Son);//true
		System.out.println(s instanceof Father);//true
		
		System.out.println(d instanceof Daughter);//true
		System.out.println(d instanceof Father);//true
		
		System.out.println(f instanceof Father);//true
		System.out.println(f instanceof Son);//False
		System.out.println(f instanceof Daughter);//false
		
		System.out.println("----------------");

		System.out.println(new Son() instanceof Father);//true
		System.out.println(new Father() instanceof Daughter);//false
		System.out.println(new Daughter() instanceof Daughter);//true
		
	}
	
}


/*
 *Father f=new Son();
	Daughter d= (Daughter)f;
	
	
	Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Cannot cast from Father to Daughter

	at ClassCastException/com.Test.main(Test.java:6)
	*/
