package Object;
public class Water {
	boolean water=true;
	public void fillwater() {
		water=true;
		System.out.println("Water filled");		
	}
	public void drinkwater() {
		if(water) {
		System.out.println("Drink water");
		water=false;
		}
		else {
			System.out.println("Fill water");
		}
	}
	public static void main(String[] args) {
		Water w1= new Water();
		w1.drinkwater();
		w1.fillwater();
		w1.drinkwater();
		w1.drinkwater();
	}
}
