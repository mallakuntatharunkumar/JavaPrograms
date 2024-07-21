package com;

public class WhatsApp2 extends WhatsApp1 {
	@Override
	void display() {
		// System.out.println(a);
		super.display();
		System.out.println("Double tick is supported");
	}
	void call() {
		System.out.println("Voice call is suppported");
	}
}

