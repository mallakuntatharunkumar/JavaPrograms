package loops;

import java.util.Scanner;

public class Neon {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number:");
		int num=sc.nextInt();
		int sq=num*num;
		int r;
		int sum=0;
		while(sq!=0) {
			 r=sq%10;
			 sum+=r;
			 sq/=10;
		}
		if(num==sum) {
			System.out.println("This number is neon");
		}
		else {
			System.out.println("This is not a neon");
		}
	}
}
