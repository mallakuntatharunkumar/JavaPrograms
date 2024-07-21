package regex;
import java.util.Scanner;
import java.util.regex.*;
public class Regex2 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		
		String s1="a";
		String s2="abaaaabab";
		Pattern p=Pattern.compile(s1);
		Matcher m=p.matcher(s2);
		int count=0;
		while(m.find()) {
			count++;
		}
		System.out.println(count);
		
	}

}
