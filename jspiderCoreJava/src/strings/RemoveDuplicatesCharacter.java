package strings;

import java.util.Scanner;

public class RemoveDuplicatesCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String:");
		String s = sc.nextLine();
		char[] ch = s.toCharArray();
		String s1 = "";
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = 0; j < ch.length; j++) {

				if (ch[i] == ch[j]) {
					count++;
				}
			}
			if (count == 1) {
				s1 += ch[i];
			} else {
				ch[i] = ' ';
			}
		}
		System.out.println(s1);

	}
}
