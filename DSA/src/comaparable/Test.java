package comaparable;

import java.util.*;

class Circle implements Comparable<Circle>{
	int radius;
	public Circle(int r) {
		this.radius=r;
	}
	public int compareTo(Circle arg) {
		return this.radius-(arg.radius);
	}
	@Override
	public String toString() {
		return "radius="+radius;
	}
	void dispaly() {
		System.out.println("Radius:"+radius);
	}
	
	
	
}
public class Test {

	public static void main(String[] args) {
		
		Circle[] arr= {new Circle(10),
						new Circle(20),
						new Circle(30),
						new Circle(70),
						new Circle(40)
		};
		Arrays.sort(arr);
		for(Circle c:arr) {
			System.out.println(c);
		}
		
	}

}
