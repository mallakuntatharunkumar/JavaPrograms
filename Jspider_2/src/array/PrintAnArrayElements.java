package array;

public class PrintAnArrayElements {
	
	
	
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		m1(a);
		for(int n:a) {
			System.out.println(n);
		}
	}
	static void m1(int[] arg) {
		for(int i=0;i<arg.length;i++) {
			arg[i]*=10;
		}
	}

}
