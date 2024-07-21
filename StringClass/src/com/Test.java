package com;

public class Test {

	public static void main(String[] args) {
		//Empty string representation
		String s1 = new String();
		System.out.println(s1);
		
		//Passing set characters
		String s2 = new String("Java");
		System.out.println(s2);
		
		char[] c= {'j','a','v','a'};
		//Converting char[] into String Object
		String s3 = new String(c);
		System.out.println(s3);
	}

}
