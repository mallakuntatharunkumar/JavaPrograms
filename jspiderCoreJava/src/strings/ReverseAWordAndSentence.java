package strings;

import java.util.Arrays;

public class ReverseAWordAndSentence {
	public static void main(String[] args) {
		String s = "java is easy thaurn";
		String[] s1 = s.split(" ");
		String s_add = "";
		for (int i = s1.length - 1; i >= 0; i--) {
			String s_check = s1[i];
			for (int j = s_check.length() - 1; j >= 0; j--) {
				s_add += s_check.charAt(j);
				
			}
			if(i>0) {
				s_add+=" ";
			}
		}
		System.out.print(s_add.trim());
	}
}
