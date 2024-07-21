package methods;

public class VarArgs2 {
static int m1(int... a) {
	int sum=0;
	for(int n:a) {
		sum+=n;
		
	}
	return sum;
	
}
public static void main(String[] args) {
	System.out.println(m1(2,4));
	System.out.println(m1(2,3,4,5,6,7));
}
}
