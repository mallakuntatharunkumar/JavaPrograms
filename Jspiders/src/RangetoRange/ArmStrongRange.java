package RangetoRange;

import java.util.Scanner;

public class ArmStrongRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Start Number:");
		int start = sc.nextInt();
		System.out.print("Enter the End Number:");
		int end = sc.nextInt();
		for (int i = start; i <= end; i++) {
			int m = i;
			int o = i;
			int sum = 0;

			int count = 0;
			while (m != 0) {
				m /= 10;
				count++;
			}

			while (o > 0) {
				int r = o % 10;
				int multi = 1;
				for (int j = 1; j <= count; j++) {
					multi *= r;

				}
				sum += multi;
				o /= 10;
			}
			if (sum == i) {
				System.out.print(i + " ");
			}
		}
	}

}
