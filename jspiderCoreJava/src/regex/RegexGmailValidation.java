package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexGmailValidation {
	public static void main(String[] args) {
		String exp="[a-z][a-z 0-9]+@[ge]mail[.]com";
		String s="tharunroyals@gmail.com";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		if(m.matches()) {
			System.out.println("Valid ");
		}
		else {
			System.out.println("Not Valid");
		}

	}
}
