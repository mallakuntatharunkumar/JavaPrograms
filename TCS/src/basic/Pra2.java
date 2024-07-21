package basic;
import java.util.*;
public class Pra2 {
	public static void main(String[] args) {
		int[] arr=new int[10];
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(24);
		l.add(30);
		l.add(0,2);
		l.remove(2);
		int index=0;
		System.out.println(l);
		for(int n:l) {
			arr[index++]=n;
		}
//		l.removeAll(l);
//		System.out.println(l);
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
