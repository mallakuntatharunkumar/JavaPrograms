package methods;

public class A2 {
	public static void main(String[] args) {
		String[] s= {"ab","bc","de"};
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		System.out.println("------------");
		for(String n:s) {
			System.out.println(n);
		}
	}
}
