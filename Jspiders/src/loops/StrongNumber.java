package loops;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number:");
		int n=sc.nextInt();
		int m=n;
		int sum=0;
		int multi=1;
		
		while(n>0){
			int r=n%10;
			for(int i=1;i<=r;i++) {
				multi*=i;
			}
			sum+=multi;
			multi=1;
			n/=10;
			
		}
		if(m==sum) {
			System.out.println("Strong Number");
		}
		else {
			System.out.println("Not a Strong number");
		}
	}
}
/* input:145=>1!+4!+5!==145
Strong number
*/