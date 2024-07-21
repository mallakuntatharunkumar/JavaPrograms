package genrics;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> a= new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		//a.add(54.34)//CTE(because it is a integer Genric type)
		System.out.println(a);
	}
}
