package selectionSort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = { 9, 4, 0, 8, 1, 3 };

		for (int i = 0; i < a.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j <a.length; j++) {
				if (a[j] < a[index]) {
					index = j;
				}
			}
			int temp = a[index];
			a[index]=a[i];
			a[i]=temp;
		}
		for (int n1 : a) {
			System.out.print(n1+" ");
		}
	}

}
