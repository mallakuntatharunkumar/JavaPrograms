package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex5 {
	public static void main(String[] args) {
		String exp = "ab+";
		String s = "abbbbabbbababbbba";
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s);
		while (m.find()) {
			System.out.println(m.group());
		}
	}

}
/* 
ab?

ab
ab
ab
ab
a
*/

/*
 ab*
 
abbbb
abbb
ab
abbbb
a
*/

/*
ab+

abbbb
abbb
ab
abbbb
*/
