package array;

public class Sorted_RemoveDuplicateElements {
	public static void main(String[] args) {
		int[] arr = { 1,1,2,3,4,5,5,5,6,6};
		int rd=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[rd]!=arr[i]) {
				rd++;
				arr[rd]=arr[i];
			}
		}
		for(int i=0;i<=rd;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
