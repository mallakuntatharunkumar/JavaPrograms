package pattern_programs;

import java.util.Scanner;

public class CristmasTree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter tree top:");
		int n = sc.nextInt();
		
		int stars = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}

			System.out.println();
			
			stars += 2;
		}
		for (int i = 1; i <= n/2; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == n||j==n-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}


	}

}
