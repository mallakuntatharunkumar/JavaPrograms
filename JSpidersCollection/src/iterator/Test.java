package iterator;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		Set s = new LinkedHashSet();
		s.add(10);
		s.add(50);
		s.add(10);
		s.add(20);
		s.add(60);
		s.add(30);
		Iterator<Integer> i = s.iterator();
		while (i.hasNext()) {
			int str = i.next();
			System.out.println(str);
		}
		System.out.println(s);
	}
}
