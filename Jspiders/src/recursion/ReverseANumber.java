package recursion;

import java.util.Scanner;

public class ReverseANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int n=sc.nextInt();
		System.out.println(reverse(n));	
	}
	static int reverse(int n) {
		int i=(int)Math.pow(10,len(n)-1);
		return rev(n,i);	
	}
	static int rev(int n, int i) {
		if(n<=9) return n;
		return((n%10)*i)+rev(n/10,i/10);
	}
	static int len(int n) {
		int count=0;
		while(n!=0) {
			n/=10;
			count++;
		}
		return count;	
	}
}
