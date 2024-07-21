package com;

class Son extends Father{
	@Override
	void bike() 
	{
		//super.bike();
		System.out.println("New Modified sons bike");
	}
	public static void main(String[] args) {
		Son s = new Son();
		s.bike();
	}
}