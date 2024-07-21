package RangetoRange;

import java.util.Scanner;

public class PerfectNumRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter start Number:");
		int start=sc.nextInt();
		System.out.print("Enter End Number:");
		int end =sc.nextInt();
		for(int i=start;i<=end;i++) {
			int sum=0;
			for(int j=1;j<=i/2;j++) {
				if(i%j==0) {
					sum+=j;
				}
			}
			if(sum==i) {
				System.out.println("'"+i+"'"+"Perfect Number");
			}
			sum=0;
		}
	}

}
