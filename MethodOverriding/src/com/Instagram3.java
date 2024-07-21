package com;

public class Instagram3 extends Instagram2 {

		void upload() {
			super.upload();
			System.out.println("Videos ae supported");
		}
		void dm() {
			super.dm();
			System.out.println("Images are supported");
		}
		
		void story() {
			System.out.println("Story can upload");
		}
	
	public static void main(String[] args) {
		Instagram3 I = new Instagram3();
		I.upload();
		I.dm();
		I.story();
	}

}
