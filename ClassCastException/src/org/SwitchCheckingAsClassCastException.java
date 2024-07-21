package org;
import java.util.*;
public class SwitchCheckingAsClassCastException {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("1.Laptop\n2.Mobile");
		int x =s.nextInt();
		
		switch(x) {
		case 1:
			System.out.println("Laptop");
			break;
		
		case 2: 
			System.out.println("Mobile");
			break;
		
		default:
			System.out.println("No Order");
		
		}
	}
}