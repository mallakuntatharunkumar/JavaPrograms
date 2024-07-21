package pattern_programs;

import java.util.Scanner;

public class TablesSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				for(int j=1;j<=n;j++) {
				System.out.print(i*j+"\t");
				}
			}
			else {
				for(int j =1;j<=n;j++) {
					System.out.print(i*j+"\t");
				}
			}
			System.out.println();
		}
	}
}
