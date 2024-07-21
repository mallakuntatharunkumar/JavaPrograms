package practice;

import java.util.Scanner;

public class QStop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int sum=0;
		while(true) {
			System.out.print("Enter number:");
			int n=sc.nextInt();
			
			if(n!=0) {
				sum+=n;	
			}
			else {
				System.out.println("Sum:"+sum);
				break;
			}
		}
	}

}
