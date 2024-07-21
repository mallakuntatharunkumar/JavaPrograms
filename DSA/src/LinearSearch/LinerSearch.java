package LinearSearch;

import java.util.Scanner;

public class LinerSearch {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] a= {1,2,3,4,5,6};
		int target=sc.nextInt();
		System.out.println(index(a,target));
		
	}
	
	public static int index(int[] a,int target) {
		int i=0;
		while(i<a.length) {
			if(a[i]==target) {
				return i;
			}
			else {
				i++;
			}
			
		}
		
		return -1;
		
	}

}
