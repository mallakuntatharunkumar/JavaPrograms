package org;
import java.util.Scanner;
public class Electronics {
	public static void main(String[] args) {
		Shoping s = new Shoping();
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Laptop\n2.Mobile");
		int x = sc.nextInt();
		
		Flipkart f = s.buy(x);
		
		
		if(f instanceof Laptop) {
			System.out.println("But the Laptop");
		}
		else if(f instanceof Mobile) {
			System.out.println("Buy Mobile");
		}
		else {
			System.out.println("No Orders");
		}

		System.exit(0);
		
		}
}
