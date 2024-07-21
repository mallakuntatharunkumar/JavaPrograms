package pattern_programs;

import java.util.Scanner;

public class SquareHallo2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i==1||i==n) {
				for(int j=1;j<=n;j++) {
					System.out.print("X"+" ");
				}
			}
			else {
				System.out.print("X"+" ");
				for(int j=1;j<=n-2;j++) {
					System.out.print("  ");
				}
				System.out.print("X"+" ");
			}
			System.out.println();
		}
		
	}
}
