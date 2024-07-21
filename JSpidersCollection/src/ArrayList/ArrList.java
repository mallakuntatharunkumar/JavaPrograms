package ArrayList;

import java.util.ArrayList;
//import java.util.Scanner;//ctrl+Shift+o

public class ArrList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();// ctrl+2+l
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);//[10, 20, 30, 40, 50]
		System.out.println(al.get(2));//30
		System.out.println(al.isEmpty());//false
		System.out.println(al.contains(40));//true
		ArrayList al2 = new ArrayList();
		al2.addAll(al);
		al2.add(60);
		al2.add(70);
		System.out.println(al2);//[10, 20, 30, 40, 50, 60, 70]
		System.out.println(al2.containsAll(al));//true
		al2.removeAll(al);
		System.out.println(al2);//[60, 70]
	}
}
//ATL+DOWN/UP ARROW->TO MOVE