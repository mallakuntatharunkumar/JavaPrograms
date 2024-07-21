
package com;

class Person1
{	
	@Override
	public String toString() {
		return "Hai dinga";
	}
	
	public static void main(String[] args) {
		Person1 p1 = new Person1();
		System.out.println(p1.toString());
		System.out.println(p1);
	}
}