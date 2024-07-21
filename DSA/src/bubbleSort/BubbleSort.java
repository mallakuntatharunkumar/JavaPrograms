package bubbleSort;

public class BubbleSort {

	public static void main(String[] args) {
		int[] bubble = { 1, 4, 2, 6, 3, 8, 5,0 };
		sort(bubble);
		for(int n:bubble) {
			System.out.print(n+" ");
		}
	}
	static void sort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
			
			
		}
		
		
	}
}
