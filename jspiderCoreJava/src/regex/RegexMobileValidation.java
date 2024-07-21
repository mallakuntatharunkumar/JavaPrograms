package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMobileValidation {
	public static void main(String[] args) {
		String exp="[9876][0-9]{9}";
		String s="9542243682";
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s);
		if(m.matches()) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Not valid");
		}
	}

}
