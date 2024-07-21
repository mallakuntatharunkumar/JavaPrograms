package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {
		String exp=".";
		String s="abcdef";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		while(m.find()) {
			System.out.println(m.group());
		}
	}
}
