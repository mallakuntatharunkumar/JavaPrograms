package com;

public class Instagram2 extends Instagram1{
	void upload() {
		super.upload();
		System.out.println("GIF is supported");
	}
	
	void dm() {
		System.out.println("Text messages are supported");
	}
}
