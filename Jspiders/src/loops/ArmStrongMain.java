package loops;

import java.util.Scanner;

public class ArmStrongMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to cheack Amstrong or Not:");
		int num = sc.nextInt();
		int m = num;
		int count = 0;
		int sum = 0;

		while (num != 0) {
			num /= 10;
			count++;
		}
		num = m;
		int r = 0;

		while (num > 0) {
			r = num % 10;
			int multi = 1;
			for (int i = 1; i <= count; i++) {
				multi = multi * r;

			}
			sum += multi;
			num /= 10;
		}
		System.out.println(sum);
		if (m == sum) {
			System.out.println("ArmStrong strong");
		} else {
			System.out.println("Not Amstrong");
		}
	}
}
