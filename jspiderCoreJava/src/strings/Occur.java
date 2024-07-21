package strings;

public class Occur {
	public static void main(String[] args) {
		String s = "abcbcbcbbc";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			if (ch[i] == ' ') {
				continue;
			}
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					ch[j] = ' ';
					count++;

				}
			}
			if (ch[i] != ' ') {
				System.out.println(ch[i] + " " + count);
			}
		}
	}
}
