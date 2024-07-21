package com;

public class Solution {
	public static void main(String[] args) {
		System.out.println("start");
		
//		Father f;
//		f = new Son();
		//Father f = new Son();
		Father f = new Daughter();
		if (f instanceof Son) {
			System.out.println("Downcasting to son");
			Son s = (Son)f;
			System.out.println(s.x+" "+s.y);
		}
		else if(f instanceof Daughter) {
			System.out.println("Downcasting to Daughter");
			Daughter d = (Daughter)f;
			System.out.println(d.x+" "+d.z);
		}
	}
}
