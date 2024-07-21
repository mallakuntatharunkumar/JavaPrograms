package RangetoRange;

import java.util.Scanner;

public class HappyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter start number:");
		int start=sc.nextInt();
		System.out.print("Enter End number:");
		int end=sc.nextInt();
		int sum=0;
		for(int i=start;i<=end;i++) {
			int m=i;
			
			do {
				while(m>0) {
					int r=m%10;
					int sq=r*r;
					sum+=sq;
					m/=10;		
				}
				m=sum;
				sum=0;
				
			}while(m>9);
			if(m==1) System.out.println(i);
		}
			
	}

}
