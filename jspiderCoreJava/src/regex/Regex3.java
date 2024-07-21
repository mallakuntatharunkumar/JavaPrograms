package regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Regex3 {
	public static void main(String[] args) {
		String a="abc";
		String s="abcabcabc";
		Pattern p=Pattern.compile(a);
		Matcher m=p.matcher(s);
		int count=0;
		while(m.find()) {
			count++;
		}
		System.out.println(count);
	}

}
