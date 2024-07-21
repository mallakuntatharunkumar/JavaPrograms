package methodReference;
@FunctionalInterface
interface Sum {
	int add(int a, int b);
}
class Util {
	public int m(int a, int b) {
		return a + b;
	}
	public static int m1(int a,int b) {
		return a;
	}
}
public class Test_1 {
	public static void main(String[] args) {
		Util u = new Util();
		Sum s1 = u::m;
		System.out.println(s1.add(10, 12));
		Sum s2=Util::m1;
		System.out.println(s2.add(10, 0));
		
	}
}
