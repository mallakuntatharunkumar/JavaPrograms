package loops;

import java.util.*;

public class Palindrone {
	public static void main(String[] args) {

		// String s2=sc.next();
//		if(s.equals(s2)) {
//			System.out.println(s2);
//		}
		// System.out.println(s.length());

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s2 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			s2 = s2 + s.charAt(i);
		}
		if (s.equals(s2)) {
			System.out.println("it is a palindrom");
		} else {
			System.out.println("Not a palindrom");
		}

	}
}
