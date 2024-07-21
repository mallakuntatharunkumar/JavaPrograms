package com;

public class Demo1 
{ /* Method without arguments and with return statement*/
	int display() 
	{
		return 10;
	}
	
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		
		int result = d.display();
		
		System.out.println(result);
		
		//System.out.println(d.display());
	}
}
