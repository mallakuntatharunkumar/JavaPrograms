package practice;

import java.util.Scanner;

public class SimpleInterest {
	
	
	double simple(int a,int b,int c) {
		return a*b*c/100;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SimpleInterest si=new SimpleInterest();
		
		System.out.print("p:");
		int p =sc.nextInt();
		System.out.print("q:");
		int q =sc.nextInt();
		System.out.print("r:");
		int r =sc.nextInt();
		
		double simpleIntrest = si.simple(p, q, r);
		
		System.out.println(simpleIntrest);
		
	}

}
