package com;

public class StringMethods {

	public static void main(String[] args) {
		
		String s = "Software Developer";
		System.out.println(s.length());//18
		
		System.out.println(s.toLowerCase());//software developer
		System.out.println(s.toUpperCase());//SOFTWARE DEVELOPER
		
		System.out.println(s.startsWith(s));//true
		System.out.println(s.startsWith("soft"));//false
		System.out.println(s.startsWith("Soft"));//true
		
		System.out.println(s.endsWith(s));//true
		System.out.println(s.endsWith("er"));//true
		System.out.println(s.endsWith("Eloper"));//false
		
		System.out.println(s.contains("Dev"));//true
		System.out.println(s.contains("dev"));//false
		
		String	a="app";
		String b="bat";
		
		System.out.println(s.concat(" in Ty"));
		System.out.println(s.concat(a+b));
		
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(14));
		
		System.out.println(s.indexOf('t'));//3
		System.out.println(s.indexOf('D'));//9
		System.out.println(s.indexOf('e'));//7
		
		String x="java";
		String y="Java";
		String z="java";
		System.out.println(x.equals(y));//false
		System.out.println(x.equals(z));//true
		System.out.println(x.equalsIgnoreCase(y));//true
		
		String name="hello dingaar";
		System.out.println(name.substring(3));//lo dinga
		System.out.println(name.substring(7));//inga
		System.out.println(name.substring(2,7));
		System.out.println(name.substring(4,10));
		
		
		
			
		
		
		
	}

	

}
