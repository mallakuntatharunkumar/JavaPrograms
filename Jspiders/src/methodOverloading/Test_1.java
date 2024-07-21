package methodOverloading;

public class Test_1 {

	public static void main(String[] args) {
		payment();
	}
	public static void payment() {
		//System.out.println("EMI");
		Test_1 t= new Test_1();
		t.payment(5000);
		
	}
	public void payment(double c) {
		System.out.println("Cash on delivery:"+c);
	}
	public static int payment(String upi) {
		System.out.println("UPI"+upi);
		return 500;
		
	}

}
