/*
 write a program that takes an interger n as input and prints all factors of n.
 
 EXAMPLE:
 INPUT:12
 OUTPUT:1,2,3,4,6,12
 */

package tapAcdmy;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n =sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				if(i*j==n) {
					System.out.print(i+" ");
					break;
				}
			}
		}
		sc.close();
	}

}
