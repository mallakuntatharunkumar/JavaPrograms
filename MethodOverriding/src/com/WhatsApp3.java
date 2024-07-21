package com;

public class WhatsApp3 extends WhatsApp2{
	@Override
	void display() {
		super.display();
		System.out.println("Blue Tickets is supported");
		
	}
	@Override
	void call() {
		super.call();
		System.out.println("Vedio call is supported");
		
	}
	void story() {
		System.out.println("Story is supported");
	}
	
	public static void main(String[] args) {
		WhatsApp3 w = new WhatsApp3();
		w.display();
		System.out.println("--------------------");
		w.call();
		System.out.println("---------------------");
		w.story();
	}
	
	
}
