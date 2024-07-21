package ArrayList;
import java.util.*;
public class Collectionss {
	public static void main(String[] args) {
		List a=new ArrayList(5);
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(60);
		a.add(50);
		a.add(50);
		Collections.sort(a);
		
		System.out.println(a);
		int[] arr= {9,8,7,6,5,5,4,2,2,1,1};
		Arrays.sort(arr);
		System.out.println(arr);
	}
}
