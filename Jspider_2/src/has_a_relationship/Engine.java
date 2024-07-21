package has_a_relationship;

class Engine {
	int cc;

	public Engine(int cc) {
		this.cc = cc;

	}

	public void displayEngine() {
		System.out.println("Engine  cc is " + cc);
	}
}
class Car {
	Engine e;
	String name;
	String color;
	int cost;

	public Car(Engine e, String name, String color, int cost) {
		this.e = e;
		this.name = name;
		this.color = color;
		this.cost = cost;
	}

	public void displayCar() {
		e.displayEngine();
		System.out.println("Name:" + name);
		System.out.println("Color:" + color);
		System.out.println("Cost:" + cost);
	}
}
