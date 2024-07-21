package recursion;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (prime(n, n / 2))
			System.out.println("Prime");
		else
			System.out.println("Not a Prime");

	}

	static boolean prime(int n, int i) {

		if (i == 0)
			return false;
		if (i == 1)
			return false;
		if (n % i == 0)
			return false;

		return prime(n, i - 1);
	}

}
