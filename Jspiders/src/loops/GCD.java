package loops;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two values:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a<b?a:b;
		
		for(int i=c;i>=1;i--) {
			if(a%i==0 && b%i==0) {
				System.out.println(i);
				break;
			}
		}
	}
}
