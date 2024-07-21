package strings;

public class Panagram {
	public static void main(String[] args) {
		String s = "a quick brown fox jumps overr the lazy dog";
		if (isPanagram(s)) {
			System.out.println("Panagram");
		} else {
			System.out.println("Not a Panagram");
		}
	}

	public static boolean isPanagram(String s) {
		String s1 = s.toLowerCase();
		if (s1.length() < 26) {
			return false;
		}
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (s1.indexOf(ch) == -1) {
				return false;
			}
		}
		return true;

	}
}
