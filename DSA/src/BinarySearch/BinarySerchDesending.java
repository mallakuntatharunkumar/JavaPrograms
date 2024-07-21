package BinarySearch;

public class BinarySerchDesending {
	public static void main(String[] args) {
		int a[] = { 6, 5, 4, 3, 2, 1 };
		int target = 4;
		int start = 0;
		int last = a.length - 1;
		int index = binarySearch(a, target, start, last);
		System.out.println(index);
	}

	public static int binarySearch(int[] a, int target, int start, int last) {
		while (start <= last) {
			int mid = (start + last) / 2;
			if (target > a[mid]) {
				last = mid - 1;
			} else if (target < a[mid]) {
				start = mid + 1;
			} else if (target == a[mid]) {
				return mid;
			}
		}
		return -1;
	}
}
