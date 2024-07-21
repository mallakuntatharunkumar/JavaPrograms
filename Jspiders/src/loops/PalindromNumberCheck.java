package loops;

import java.util.Scanner;

public class PalindromNumberCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=n;
		int rev=0;
		while(n>0) {
			int r=n%10;
			rev=(rev*10)+r;//11
			n/=10;
		}
		if(m==rev) {
			System.out.println("Palindorm");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}
}
