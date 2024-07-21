package basic;
import java.util.*;
public class Sort {
	
	
	public static int[] sort(int[] arr) {
		
		Set<Integer> s=new LinkedHashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			s.add(arr[i]);
		}
		int[] b=new int[s.size()];
		int index=0;
		for(int aa:s) {
			b[index++]=aa;
		}
		return b;
		
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,4,0,0,3,2,1,0,1,0,9,4,2,9,100};
		int[] b=sort(arr);
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		
	}

}
