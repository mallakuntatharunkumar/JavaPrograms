package pattern_programs;

import java.util.Scanner;

public class HalloTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sp=n-1;
		int st=1;
		for (int i = 1; i <= n; i++) {
			for(int j=1;j<=sp;j++)System.out.print(" ");
			for(int j=1;j<=st;j++) {
				if(j==1||i==n||j==st) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
			System.out.println();
			sp--;
			st+=2;
			
			
		}
	}

}