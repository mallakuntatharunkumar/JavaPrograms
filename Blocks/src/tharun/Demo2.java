package tharun;

public class Demo2 {
	static int age;
	
	static {
		//System.out.println("Initianlizing age to 10");
		age=10;
	}
	public static void main(String[] args) {
		System.out.println("Age:"+Demo2.age);
	} 
	static {
		//System.out.println("Initianlizing age to 20");
		age=20;//Demo2.age=20
	}
	
}
