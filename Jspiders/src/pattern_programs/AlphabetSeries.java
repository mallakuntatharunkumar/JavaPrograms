/*ABCDEF
  LKJIHG
  MNOPQR
 */
package pattern_programs;

import java.util.Scanner;

public class AlphabetSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			if (i % 2 != 0) {
				int num =((i-1)*n)+65;
				for (int j = 1; j <= n; j++) {
					System.out.print((char) num+" ");
					num++;
				}
			} 
			else {
				int num1=i*n+64;
				for(int j=1;j<=n;j++) {
					System.out.print((char)num1+" ");
					num1--;
				}
			}
			System.out.println();
		}
	}
}


