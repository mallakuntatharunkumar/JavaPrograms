package array2D;

public class MatirxMultiplication_2 {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 3, 4, 5 }, { 5, 6, 7 } };
		int[][] b = { { 1, 2, 3 }, { 3, 4, 5 }, { 5, 6, 7 } };
		int[][] c = new int[a.length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				for (int k = 0; k < a.length; k++) {
					c[i][j] += a[i][k] * b[k][j];

				}

			}
		}
		for (int[] row : c) {
			for (int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

	}

}
