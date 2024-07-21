package lambdaExpressions;
interface I2{
	int square(int i,int j);
}
public class Test2 {
	
	public static void main(String[] args) {
		I2 i2=(i,j)->i*i;
		System.out.println(i2.square(4,5));
	}

}
