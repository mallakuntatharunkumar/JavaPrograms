package pattern_programs;

import java.util.Scanner;

public class ReveseTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*(n-i)-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
//(2*i)-1
//2*(n-i)-1