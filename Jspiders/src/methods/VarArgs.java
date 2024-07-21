package methods;

public class VarArgs {
	public static void main(String[] args) {
		varArgs(2);
		varArgs(1,2,3,4,5,6);
		
	}
	static void varArgs(int... a) {
		
		for(int n:a) {
			System.out.println(n);
		}
		System.out.println("---------------");
	}
	
}
