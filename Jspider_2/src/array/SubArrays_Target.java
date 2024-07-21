package array;

public class SubArrays_Target {
	public static void main(String[] args) {
		int[] arr= {3,4,-7,1,3,3,1,-4};
		int target=7;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				sum=sum+arr[j];
				if(sum==target) {
					System.out.print("[");
					for(int k=i;k<=j;k++) {
						System.out.print(arr[k]);
						if(k<j) {
							System.out.print(",");
						}
					}
					System.out.print("]");
					System.out.println();
				}
			}
			sum=0;
		}
		
		
		
	}

	
}
//Brute Force alogoitham