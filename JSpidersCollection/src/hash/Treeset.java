package hash;
import java.util.*;
public class Treeset {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeSet<Integer> a= new TreeSet();
		
		int l=sc.nextInt();
		for(int i=1;i<=l;i++) {
			int num=sc.nextInt();
			a.add(num);
		}
//		a.add(10);
//		a.add(50);
//		a.add(40);
//		a.add(20);
//		a.add(20);
//		a.add(100);
		System.out.println(a);
	}

}
