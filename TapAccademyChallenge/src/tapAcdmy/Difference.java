/*
 Write a program that prints all pairs from an array whose difference is equal to k.
 
 example:
 Array;[9,5,6,1,2]
 Difference:4
 pairs:(9,5),(5,1),(6,2)
 */

package tapAcdmy;
public class Difference {
	public static void main(String[] args) {
		int[] arr= {9,5,6,1,2};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length;j++) {
				if(arr[i]-4==arr[j]) {
					System.out.print("("+arr[i]+","+arr[j]+")");
				}
				
			}
		}
	}

}
