package array2D;

public class RemoveDuplicateElemnetsFromArray {
	public static void main(String[] args) {
		
		int[] arr= {2,3,2,5,6,6,7,4,4,8,9,2,1};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(arr[i]);
			}
			count=0;
		}
	}

}
