/*
 Write a program that finds the largest element present in an array.
 Example:
 Array:[5,10,3,8,15]
 Largest Element:15
 */
package tapAcdmy;
public class Largest {
	public static void main(String[] args) {
		int[] arr = {5,10,3,8,15,2,34,43,1,0};
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
		
	}
}
