package stack;

import java.util.Stack;

public class BalanceString {
	
	public static void main(String[] args) {
		System.out.println(isBalance(""));
		if(isBalance("{}}"))
			System.out.println("Balance String");
		else
			System.out.println("Not a Balanceing String");
	}
	public static boolean isBalance(String s) {
		Stack<Character> stack = new Stack<Character>();
		char[] ch = s.toCharArray();
		char ch1 = ' ';
		char ch2 = ' ';
		for (int i = 0; i < ch.length; i++) {
			ch1 = ch[i];
			if (ch1 == '{' || ch1 == '(' || ch1 == '[') {
				stack.push(ch1);
			} else if (ch1 == '}' || ch1 == ']' || ch1 == ')') {

				if (stack.isEmpty()) {
					return false;
				}
				ch2 = stack.pop();
				if (!pair(ch2, ch1)) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	private static boolean pair(char ch1, char ch2) {
		if (ch1 == '{' && ch2 == '}' || ch1 == '[' && ch2 == ']' || ch1 == '(' && ch2 == ')') {
			return true;
		} else {
			return false;

		}
	}
}
