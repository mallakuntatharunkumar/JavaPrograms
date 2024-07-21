package loops;
import java.util.Scanner;
public class AlternativeNumSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int n = sc.nextInt();
		int count = 0;
		int Sum1 = 0;
		int Sum2 = 0;
		while (n != 0) {
			int r = n % 10;
			n /= 10;
			count++;
			if (count % 2 != 0) {
				Sum1 += r;
			} else {
				Sum2 += r;
			}
		}
		System.out.println(Sum1+ "\n"  +Sum2 );
	}
}
