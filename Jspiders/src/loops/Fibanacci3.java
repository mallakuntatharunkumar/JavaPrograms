package loops;

import java.util.Scanner;

public class Fibanacci3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter start range:");
		int start=sc.nextInt();
		System.out.print("Enter End range:");
		int upto=sc.nextInt();
		
		int a=0;
		int b=1;
		while(a<=upto) {
			
			if(a>=start) {
				System.out.println(a);
			}
			int c= a+b;
			a=b;
			b=c;
		}
	}
	
	


}
/*100
50
55
89
*/