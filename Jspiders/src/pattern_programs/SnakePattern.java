package pattern_programs;

import java.util.Scanner;

public class SnakePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				int r = i - 1;
				int x = (r * (r + 1)) / 2;
				x = x + 1;

				for (int j = 1; j <= i; j++) {
					System.out.print(x+"\t");
					x++;
				}
			} 
			else {
				int y = (i * (i + 1))/2;
				for (int j = 1; j <= i; j++) {
					System.out.print(y+"\t");
					y--;
				}
			}
			System.out.println();
		}
		
	}
}
