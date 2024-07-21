package basic;
import java.util.*;
public class Pra {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(0);
		al.add(1);
		al.add(3);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(6);
		al.add(100);
		al.add(100);
		Set<Integer> a=new LinkedHashSet<Integer>();
		a.addAll(al);
		System.out.println(a);
		int[] arr=new int[a.size()];
		int index=0;
		for(int a2:a) {
			arr[index++]=a2;
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[0]+" "+arr[arr.length-1]);
		
		
	}
}
