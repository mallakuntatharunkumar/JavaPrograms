package strings;

import java.util.Scanner;

public class CountLcUcNumSym {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String:");
		String s= sc.nextLine();
		int lower=0;
		int upper=0;
		int number=0;
		int symbol=0;
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z') {
				lower++;
			}
			else if(ch>='A'&& ch<='Z') {
				upper++;
			}
			else if(ch>='0'&&ch<='9') {
				number++;
			}
			else {
				symbol++;
			}
		}
		System.out.println("lower:"+lower+"\n"+"upper:"+upper+"\n"+"number:"+number+"\n"+"symbol:"+symbol);
	}
}

