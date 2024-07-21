package basic;

import java.util.Scanner;

public class StarHash {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the symbols '*' and '#' ");
		String s=sc.nextLine();
		char s1;
		int star=0;
		int hash=0;
		for(int i=0;i<s.length();i++) {
			
			s1=s.charAt(i);
			if(s1=='*') {
				star++;
			}
			else if (s1=='#'){
				hash++;
			}
		}
		System.out.println(star);
		System.out.println(hash);
		System.out.println(star-hash);
	}
}
