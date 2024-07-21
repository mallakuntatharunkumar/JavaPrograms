package array2D;

public class MatirxMultiplication {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 3, 4, 5 }, { 5, 6, 7 }};
		int[][] b = { { 1, 2, 3 }, { 3, 4, 5 }, { 5, 6, 7 } };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {

				for (int k = 0; k < b.length; k++) {
					sum += a[i][k] * b[k][j];

				}
				System.out.print(sum + " ");
				sum = 0;
			}
			System.out.println();
		}

	}

}
