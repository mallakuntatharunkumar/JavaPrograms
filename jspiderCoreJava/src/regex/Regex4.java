package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex4 {
	public static void main(String[] args) {
		String exp="([a-z][A-z])//1";
		String s="aAa";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		while(m.find()) {
			System.out.println(m.group());
		}
	}

}
