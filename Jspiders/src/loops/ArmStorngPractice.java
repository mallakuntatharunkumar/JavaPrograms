package loops;

import java.util.Scanner;

public class ArmStorngPractice {
	public static void main(String[] args) {
		System.out.print("enter number:");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=n;
		int res=n;
		int count=0;
		int sum=0;
		
		while(n>0) {
			n/=10;
			count++;
		}
		
		while(m>0) {
			int r=m%10;
			int multi=1;

			for(int i=1;i<=count;i++) {
				multi*=r;
			}
			sum+=multi;
			m/=10;
		}
		if(res==sum) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not armstrong");
		}
	}

}
