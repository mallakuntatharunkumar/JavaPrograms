package pattern_programs;

import java.util.Scanner;

public class HalloDiamand {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int spaces=n/2;
		int stars=1;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=spaces-2;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++) {
				if(j==1||j==stars) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			if(i<=spaces) {
				spaces--;
				stars+=2;
			}
			else {
				spaces++;
				stars-=2;
			}
			
		}
	}

}
