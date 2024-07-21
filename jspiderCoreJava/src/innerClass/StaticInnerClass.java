package innerClass;

public class StaticInnerClass {
	static class InnerStatic {
		int i = 10;
		static int j = 20;

		void m1() {
			System.out.println("m1-inner");
		}

		static void m2() {
			System.out.println("M2-inner");
		}
	}
	public static void main(String[] args) {
		System.out.println(StaticInnerClass.InnerStatic.j);
		StaticInnerClass.InnerStatic.m2();
		StaticInnerClass.InnerStatic in = new StaticInnerClass.InnerStatic();
		System.out.println(in.i);
		in.m1();
	}
}