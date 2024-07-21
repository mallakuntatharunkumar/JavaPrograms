package methodReference;
@FunctionalInterface
interface Sum2 {
	int add(int a, int b);
}
class Util_1 {
	public int m(int a, int b) {
		return a + b;
	}
	public int m2(int a, int b) {
		return a + b;
	}
	public static int m1(int a,int b) {
		return a+b;
	}
}
public class Test2 {
	public static void main(String[] args) {
		Util_1 u = new Util_1();
		Sum2 s1 = u::m;//Referring non static method 
		System.out.println(s1.add(10, 12));
		
		Sum2 s3= u::m2;//Referring a non static menthod
		System.out.println(s3.add(30, 40));
		
		Sum2 s2=Util_1::m1;//Referring static method 
		System.out.println(s2.add(10, 20));
		
	}
}