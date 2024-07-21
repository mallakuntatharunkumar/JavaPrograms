package insertionSort;

public class InsertionSort {
	public static void main(String[] args) {
		int[] a = { 4, 1, 6, 9, 3, 4, 1 };
		sort(a);
		for (int n2 : a) {
			System.out.print(n2 + "  ");
		}
	}

	static void sort(int[] a) {
		
		for(int i=0;i<a.length;i++) {
			int key=a[i];
			int j=i-1;
			while(j>=0&&a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}
}
