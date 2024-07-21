package tapAcdmy;

import java.util.Scanner;

/*
Write a program Quadratic to find the roots of the equation a*x*x + b*x + c. Since
the equation is x*x, hence there are 2 roots. The 2 roots of the equation can be
found using a formula

delta = b*b - 4*a*c
Root 1 of x = (-b + sqrt(delta))/(2*a)
Root 2 of x = (-b - sqrt(delta))/(2*a)
Take a, b, and c as input values to find the roots of x.
 */
public class Quadratic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int delta=b*b - 4*a*c;
		double root1_x = (-b + Math.sqrt(delta))/(2*a);
		
		 double root2_x = (-b -Math.sqrt(delta))/(2*a);
		 System.out.println(root1_x);
		 System.out.println(root2_x);
		
		
		//System.out.println((int)Math.sqrt(a));
	}

}
