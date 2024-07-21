package day1;
import java.util.*;
public class Demo2 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<=10;i++) {
			int j = sc.nextInt();
			al.add(j);
		}
		int sum=0;
		for(int i=0;i<al.size();i++) {
			sum= sum+(int) al.get(i);
		}
		System.out.println(sum);
		
	}
}
