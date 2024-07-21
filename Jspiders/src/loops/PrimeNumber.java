package loops;
import java.util.*;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number:");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		if (n + 1 == sum) {
			System.out.println("prime :)");
		} else {
			System.out.println("NOt prime :(");
		}

	}
}
