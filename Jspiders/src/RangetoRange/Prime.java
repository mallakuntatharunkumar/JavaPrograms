package RangetoRange;

//53, 59, 61, 67, 71,73, 79, 83, 89, 97
import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int i, j;
		int num = 0;
		for (i = start; i <= end; i++) {
			for (j = 2; j < i; j++) {

				if (i % j == 0) {
					break;
				}
			}
			if (i == j) {
				System.out.print(i + " ");
			}
			

//			if (num < j) {
//				num = j;
//			}

		}
		//System.out.println("Greatest:" + num);

	}

}
