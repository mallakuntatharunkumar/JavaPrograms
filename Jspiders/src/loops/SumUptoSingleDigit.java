package loops;

import java.util.Scanner;

public class SumUptoSingleDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int n=sc.nextInt();
		int sum=0;
		do {
			while(n>0) {
				int r=n%10;
				sum+=r;
				n/=10;
			}
			System.out.println(sum);
			n=sum;
			sum=0;
		}while(n>9);
		System.out.println(n);
	}

}
