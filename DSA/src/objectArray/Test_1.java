package objectArray;

import java.util.Arrays;

class Circle {
	int radius;

	public Circle(int r) {
		radius = r;
	}
	public String toString() {
		return "radius"+radius;
	}
}

public class Test_1 {
	public static void main(String[] args) {
		
		Circle[] c=new Circle[3];
		c[0]=new Circle(10);
		c[1]=new Circle(20);
		c[2]=new Circle(30);
		System.out.println(Arrays.toString(c));
		
	}

	
}
