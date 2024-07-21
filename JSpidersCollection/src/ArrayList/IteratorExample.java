package ArrayList;

import java.util.ArrayList;
import java.util.*;

public class IteratorExample {
	public static void main(String[] args) {
		
	
	ArrayList<Integer> a =new ArrayList<Integer>();
	a.add(10);
	a.add(20);
	a.add(30);
	a.add(40);
	a.add(50);
	ListIterator<Integer> itr= a.listIterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		
	}
	
	ListIterator<Integer> itr2=a.listIterator(a.size());
	while(itr.hasPrevious()) {
		System.out.print(itr.previous()+"");
	}
	
	}
}
