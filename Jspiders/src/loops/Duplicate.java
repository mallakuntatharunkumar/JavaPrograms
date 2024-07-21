package loops;

import java.util.Scanner;

public class Duplicate {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Input:");
		String s=sc.nextLine();
		System.out.print("Check:");
		char s3 =sc.next().charAt(0);
		int count=0;
		for(int i=0;i<=s.length()-1;i++) {
			char s2=s.charAt(i);
			if(s3==s2) {
				count++;
			}
		}
		System.out.println(s3+":"+count);
	}
}
