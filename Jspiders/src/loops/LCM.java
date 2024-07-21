//Common LCM for the 2 numbers
package loops;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		int n=num1>num2?num1:num2;
		
		while(true) {
			
			if(n%num1==0 && n%num2==0) {
				System.out.println(n);
				break;
			}
			n++;
		}
		
	}
}
