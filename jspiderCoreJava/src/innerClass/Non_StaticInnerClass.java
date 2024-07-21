package innerClass;

public class Non_StaticInnerClass {
	class Inner {
		int i = 10;
		static int j = 20;

		void m1() {
			System.out.println("M1-Inner");
		}

		static void m2() {
			System.out.println("M2-Inner");
		}
	}

	public static void main(String[] args) {
		System.out.println(Non_StaticInnerClass.Inner.j);
		Non_StaticInnerClass.Inner.m2();
		// way-1
		Non_StaticInnerClass ns = new Non_StaticInnerClass();
		Non_StaticInnerClass.Inner inn = ns.new Inner();
		System.out.println(Inner.j);
		inn.m1();
		// way-2;
		Non_StaticInnerClass.Inner inn2 = new Non_StaticInnerClass().new Inner();
		System.out.println(Inner.j);
		inn2.m1();
		// way-3

		new Non_StaticInnerClass().new Inner().m1();

	}
}
