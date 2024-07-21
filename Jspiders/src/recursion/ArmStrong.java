package recursion;

import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
//		System.out.println(count(1238));
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		if(isArmstrong(n,count(n))==n)System.out.println("ArmStrong");
		
	}
	
	static int isArmstrong(int n,int c) {
		if(n==0)return 0;
		return (int)Math.pow(n%10,c)+isArmstrong(n/10,c);
	}
	static int count(int n) {
		if(n==0)return 0;
		return 1+count(n/10);
	}

}
