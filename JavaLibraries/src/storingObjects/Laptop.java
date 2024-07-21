package storingObjects;

public class Laptop {
	String brand;
	int cost;
	String ramSize;
	Laptop(String brand, int cost, String ramSize) {
		this.brand = brand;
		this.cost = cost;
		this.ramSize = ramSize;
	}
//	alt+shift+s
	
	public String toString() {
		return "Brand:"+brand+"\nCost:"+cost+"\nRam Size:"+ramSize;
	}
	

}
