package array;
import java.util.Scanner;
public class Array5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter search:");
		int search = sc.nextInt();
		int[] n = { 1, 12, 34, 78, 89, 41, 45 };
		for (int i = 0; i < n.length; i++) {
			if (n[i] == search) {
				System.out.println(i);
				break;
			}
		}

	}
}
