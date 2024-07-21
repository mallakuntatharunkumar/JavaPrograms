package regex;
//import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex1 {
	public static void main(String[] args) {
		String exp="a";
		String s="ababbbaaa";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		System.out.println(m.find());
		System.out.println(m.find());
		System.out.println(m.find());
		System.out.println(m.find());
		System.out.println(m.find());
		System.out.println(m.find());
		System.out.println(m.find());
		System.out.println(m.find());
		
	}

}
