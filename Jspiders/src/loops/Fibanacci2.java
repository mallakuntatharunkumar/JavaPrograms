//Fibanacci number upto n range print the series
package loops;

import java.util.Scanner;

public class Fibanacci2 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter number:");
		int n =sc.nextInt();
		
		
		int a=0;
		int b=1;
		while(a<=n) {
			System.out.print(a+" ");
			int c= a+b;
			a=b;
			b=c;
			
		}
	}
}
