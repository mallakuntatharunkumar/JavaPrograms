package recursion;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n= sc.nextInt();
		
		if(strong(n)==n)System.out.println("Strong number");
		}
	static int strong(int n) {
		if(n==0)return 0;
		return fact(n%10)+strong(n/10);
	}
	static int fact(int n) {
		if(n<=0) return 1;
		return n*fact(n-1);
	}
	
}
