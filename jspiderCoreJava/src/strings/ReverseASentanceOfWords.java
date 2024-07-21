package strings;

public class ReverseASentanceOfWords {
	public static void main(String[] args) {
		String s = "java is easy is but tough for me ";
		String[] a = s.split(" ");
		String s2 = a[a.length - 1];
		for (int i = a.length - 2; i >= 0; i--) {
			s2 += " " + a[i];
			
		}
		System.out.println(s2);
	}
}
