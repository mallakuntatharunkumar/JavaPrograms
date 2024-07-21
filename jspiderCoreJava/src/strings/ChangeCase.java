package strings;

import java.util.Scanner;

public class ChangeCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String:");
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]>='a'&&ch[i]<='z') {
				ch[i]=(char)(ch[i]-32);
			}
			else if(ch[i]>='A'&&ch[i]<='Z') {
				ch[i]=(char)(ch[i]+32);
			}
		}
		System.out.println(ch);
		
	}
}
