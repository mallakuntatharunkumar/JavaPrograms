package tapAcdmy;

import java.util.*;

public class MissingNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		
		for (int i = 0; i < n; i++) {

			arr[i] = sc.nextInt();
		}
		
		
//		for (int i = 0; i < arr.length; i++) {	
//			System.out.print(" "+arr[i]);
//			
//			}
		
		for (int j = 0; j < arr.length; j++) {
			if(arr[j]== j) {
				System.out.println(arr[j]);
			}
		}
		
				
				
		}
	}


