package practice;

import java.util.Scanner;
public class Swapping {
	
	int a,b,c;
	
	void swap(int a, int b,int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		System.out.println("Before Swapping");
		c=a;
		a=b;
		b=c;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("After Swapping");
	}
	public static void main(String[] args) {
		Swapping s = new Swapping();
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		
		s.swap(x,y,z);
	}
}
