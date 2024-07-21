package BinarySearch;

public class BinarySearchPractice {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8};
		int target=6;
		int index=search(arr,target);
		System.out.println("Index:"+index);
	}
	public static int search(int[] arr,int target) {
		int first=0;
		int last=arr.length-1;
		
		while(first<=last) {
			int mid=(first+last)/2;
			if(target<arr[mid]) {
				last=mid-1;
			}
			else if(target>arr[mid]) {
				first=mid+1;
			}
			else if(target==arr[mid]) {
				return mid;
			}
		}
		return -1;
		
	}
}
