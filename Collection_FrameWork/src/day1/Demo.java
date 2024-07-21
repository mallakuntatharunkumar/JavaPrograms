package day1;
import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		System.out.println(l);
		l.add(10);
		l.add(20.34);
		l.add(10);
		l.add(null);
		l.add("java");
		System.out.println(l);//[10, 20.34, 10, null, java]
		
		System.out.println(l.size());//5
		
		System.out.println(l.get(2));//index 2 is 10
		
		//System.out.println(l.get(250));//IndexOutOfBoundsException
		
		System.out.println(l.contains("java"));//true
		System.out.println(l.contains("Java"));//false
		
		l.remove(2);
		System.out.println(l);//[10, 20.34, null, java]
		
		System.out.println(l.isEmpty());//false
		l.clear();
		System.out.println(l);//[]
		
		ArrayList l1 = new ArrayList();
		l1.add(20);
		l1.add(10);
		l1.add(30);
		l1.add(10);
		l1.add(30);
		l1.add(10);
		l1.add(60);
		System.out.println(l1);//[20, 10, 30, 10, 30, 10, 60]
		System.out.println(l1.indexOf(10));//1
		System.out.println(l1.indexOf(30));//2
		System.out.println(l1.indexOf(100));//-1 if the object is not present in the list
		
		System.out.println(l1.lastIndexOf(10));//5
		ArrayList l2= new ArrayList();
		l2.add(10);
		l2.add(20);
		l2.add(30);
		l2.add(40);
		
		l2.add(2,3);
		System.out.println(l2);
		l2.set(1, 56);
		System.out.println(l2);//[10, 56, 3, 30, 40]
		
		
		
		
		
	
	}

}
