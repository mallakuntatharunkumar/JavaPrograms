package array2D;

import java.util.Arrays;

public class CopyArray {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8};
		int[] b= new int[a.length];
		System.out.println(Arrays.toString(a));
		System.arraycopy(a, 0, b, 0, a.length-1);
		System.out.println(Arrays.toString(a));
	}

}
