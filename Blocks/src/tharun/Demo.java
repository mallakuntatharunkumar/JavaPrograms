package tharun;
  
public class Demo {
	 static {
		 System.out.println("in static block 1");
	 }
	
	 static {
		 System.out.println("in static block 2");
	 }
	public static void main(String[] args) {
		System.out.println("end");
	}
	static {
		 System.out.println("in static block 3");
	 }
}
