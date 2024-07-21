package strings;

public class Anagram2 {
	public static void main(String[] args) {
		String s1 = "car";
		String s2 = "rac";
		if (isAnagra(s1, s2) == s1.length()) {
			System.out.println("anagrame");
		} else {
			System.out.println("Not anagram");
		}
	}

	public static int isAnagra(String s1, String s2) {
		s1.toLowerCase();
		s2.toLowerCase();
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		int count = 0;
		if (c1.length != c2.length) {
			return 0;
		}
		for (int i = 0; i < c1.length; i++) {
			for (int j = 0; j < c2.length; j++) {
				if (c1[i] == c2[j]) {
					count++;
					c2[j] = ' ';
				}
			}
		}
		return count;
	}

}
