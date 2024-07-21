package methodHiding;

public class Veh {
	int cc=1000;
	void start() {
		System.out.println("V-start()");
	}
	public static void main(String[] args) {
		Bike b= new Bike();
		b.m1();
	}
}
class Bike extends Veh{
	public void m1() {
		System.out.println(super.cc);
		super.start();
	}
}

