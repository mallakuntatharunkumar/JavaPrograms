package loops;

import java.util.Scanner;

public class PrimeNumbersMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to check Prime:");
		int n=sc.nextInt();
		int count=0;
		if(n<=1)count++;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a Prime Number");
		}
	}

}



//a number which is divisible by only one and it self 
