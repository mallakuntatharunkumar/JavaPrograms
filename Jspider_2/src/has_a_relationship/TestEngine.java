package has_a_relationship;

public class TestEngine {
	public static void main(String[] args) {
		Car c=new Car (new Engine(1000),"bmw","black",1000000);
		c.displayCar();
		c.e.cc=2000;
		c.displayCar();
		
	}

}
