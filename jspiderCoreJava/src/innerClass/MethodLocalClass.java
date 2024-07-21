package innerClass;

public class MethodLocalClass {
	public static void main(String[] args) {
		class Innerr {
//			int static j=90;//CTE
	static void m1(int a, int b) {
				System.out.println(a + b);
			}
		}

		Innerr i1 = new Innerr();
		i1.m1(10, 20);

	}
}

//package innerClass;
//
//public class MethodLocalClass {
//    public static void main(String[] args) {
//        class Innerr {
//            void m1(int a, int b) {
//                System.out.println(a + b);
//            }
//        }
//
//        Innerr i1 = new Innerr();
//        i1.m1(10, 20);
//    }
//}
