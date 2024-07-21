package loops;

import java.util.Scanner;

public class Spy {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number to check SPY Number:");
		int n=sc.nextInt();
		int sum=0;
		int mul=1;
		while(n!=0) {
			int r=n%10;
			sum+=r;
			mul*=r;
			n/=10;
			
		}
		String s = sum==mul?"It is a SPY number":"It is not a SPY number";
		System.out.println(s);
	}
}

/* input:231
sum=2+3+1=6
product=2*3*1=6
sum==product

then it is a Spy number
*/
