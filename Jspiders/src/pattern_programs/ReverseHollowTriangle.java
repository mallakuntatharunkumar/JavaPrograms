//package pattern_programs;
//
//public class ReveseHalloTrinagle {
//	public static void main(String[] args) {
//		int n=5;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i-1;j++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=2*(n-i)-1;j++) {
////				System.out.print("*");
//				if(i==1|| j == 2 * (n - i) - 2||j==1) {
//					System.out.print("X ");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//	}
//}
////(2*i)-1
////2*(n-i)-1


package pattern_programs;

public class ReverseHollowTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                if (i == 0 || j == 0 || j == 2 * (n - i) - 2) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

