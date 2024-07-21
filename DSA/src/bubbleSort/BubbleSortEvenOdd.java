package bubbleSort;

public class BubbleSortEvenOdd {
	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5, 6, 7 };

		//for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {

				if (ar[j] % 2 == 0) {
					int temp = ar[ar.length - j];
					ar[ar.length - j] = ar[j];
					ar[j] = temp;
				}
				for (int n1 : ar) {
					System.out.print(" "+n1);
				}
				System.out.println();

			}
			System.out.println();
		}
//		for (int n1 : ar) {
//			System.out.println(n1);
//		}

	}

//}
