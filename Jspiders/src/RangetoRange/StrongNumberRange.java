package RangetoRange;

import java.util.Scanner;

public class StrongNumberRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int m;

		for (int i = start; i <=end; i++) {
			m=i;
			int fact=1;
			int sum=0;
			while(m>0) {
				int r=m%10;
				for(int j=1;j<=r;j++) {
					fact*=j;
				}
				m/=10;
				//System.out.print(fact+" ");
				sum+=fact;
				fact=1;
			}
			//System.out.println("sum:"+sum);
			
			if(sum==i) {
				System.out.println(i+" is Strong Number");
			}
			sum=0;
		}
	}
}
