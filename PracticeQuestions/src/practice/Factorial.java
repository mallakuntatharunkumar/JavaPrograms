package practice;

import java.util.Scanner;

public class Factorial {
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("enter value:");
		int n =s.nextInt();
		
		int p=1;
		
		for(int i = 5;i>=1;i--)
		{
			p=p*i;
			System.out.println("Value of P:"+p);
		}
		System.out.println(p);
		
		
		
		
	}
}
