package QuickSort;

public class QuickSortPractice {
	public static void sort(int[] a, int start, int end) {
		if (start >= end)
			return;
		int pivot = a[(start + end) / 2];
		int i = start;
		int j = end;
		while (i <= j) {
			while (a[i] < pivot)
				i++;
			while (a[j] > pivot)
				j--;
			if (i <= j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		sort(a, start, j);
		sort(a, i, end);
	}

	public static void main(String[] args) {
		int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		sort(arr, 0, arr.length - 1);
		for (int n : arr) {
			System.out.print(n+" ");
		}
	}

}
