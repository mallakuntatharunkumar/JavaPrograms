package strings;

import java.util.Scanner;
//symbols->numbers->lower->Upper
public class ArrangeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String:");
		String s=sc.nextLine();
		String lower="";
		String upper="";
		String number="";
		String symbol="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z') {
				lower+=ch;
			}
			else if(ch>='A'&& ch<='Z') {
				upper+=ch;
			}
			else if(ch>='0'&&ch<='9') {
				number+=ch;
			}
			else {
				symbol+=ch;
			}
		}
		s=symbol+lower+upper+number;
		System.out.println(s);
	}
}
