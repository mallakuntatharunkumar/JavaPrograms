package pattern_programs;

import java.util.Scanner;

public class Karthik {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||i==n/2||j==1||j==n/2||j==n||i==n) {
					System.out.print("X");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
//			System.out.println();
		}
	}
}
