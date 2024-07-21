package strings;

public class NumberToString {
	public static void main(String[] args) {
		String a = "9876";
		String s = "";
		char[] ch = a.toCharArray();
		for (int i =ch.length-1; i>=0; i--) {
			if (i == 4) {
				s += "Thousand ";
				if (ch[i] == 1)
					s += "one";
				else if (ch[i] == 2)
					s += "two";
				else if (ch[i] == 3)
					s += "three";
				else if (ch[i] == 4)
					s += "four";
				else if (ch[i] == 5)
					s += "five";
				else if (ch[i] == 6)
					s += "six";
				else if (ch[i] == 7)
					s += "seven";
				else if (ch[i] == 8)
					s += "eight";
				else if (ch[i] == 9)
					s += "nine";
		else if(i == 3) {
			s += "hundrenrd ";
			if (ch[i] == 1)
				s += "one";
			else if (ch[i] == 2)
				s += "two";
			else if (ch[i] == 3)
				s += "three";
			else if (ch[i] == 4)
				s += "four";
			else if (ch[i] == 5)
				s += "five";
			else if (ch[i] == 6)
				s += "six";
			else if (ch[i] == 7)
				s += "seven";
			else if (ch[i] == 8)
				s += "eight";
			else if (ch[i] == 9)
				s += "nine";
			
		}

			}
		}
		System.out.println(s);

	}

}
