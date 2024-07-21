package RangetoRange;

import java.util.*;

public class SecLargePrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int i, j;
		int num = 0;
		int count=0;
		for (i = end; i >= start; i--) {
			for (j = 2; j < i; j++) {

				if (i % j == 0) {
					break;
				}
			}
			if (i == j) {
				//count++;
				//System.out.print(i + " ");
				count++;
			}
			if (count==2) {
				System.out.println(i);
				break;
			}

		}

	}

}
