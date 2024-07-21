package com;

public class Account {
	 int id=101;
	private static Account ac=null;
	private Account() {
		System.out.println("Object is created");
	}
	public static Account objectClass() {
		if(ac==null) {
			ac=new Account();
			//System.out.println(id);
		}
		else {
			System.out.println("Cannot create object");
		}
		return ac;
	}

}
