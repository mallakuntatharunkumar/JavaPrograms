package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPasswordValidation {
	public static void main(String[] args) {
		String exp="(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[?/.!@#$%^&*()]).{6,8}";
		String s="Tharun#46";
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s);
		if(m.matches()) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
	}

}
