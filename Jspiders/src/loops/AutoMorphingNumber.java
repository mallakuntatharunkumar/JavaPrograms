package loops;

import java.util.Scanner;

public class AutoMorphingNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int n=sc.nextInt();
		int sq=n*n;
		int m=n;
		int i=1;
		while(n!=0) {
			n/=10;
			i*=10;
		}
		if(m==sq%i) {
			System.out.println("AutoMorphing number");
		}
		else {
			System.out.println("Not a AutoMorphing Number");
		}
	}
}

/* input:25
 	square of the number 625
 	last number of square is equal to 25
 	input-2:5
 	square of the number 25
 	last number of square is euqal to 5
 	
 */
