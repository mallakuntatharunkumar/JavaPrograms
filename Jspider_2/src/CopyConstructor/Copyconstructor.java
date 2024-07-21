package CopyConstructor;

public class Copyconstructor {
	int cost;
	String s;
	Copyconstructor(int cost,String s){
		this.cost=cost;
		this.s=s;
	}
	public Copyconstructor(Copyconstructor a) {
		this.cost=a.cost;
		this.s=a.s;
		
	}
	void display() {
		System.out.println(cost+" "+s);
	}
	
	public static void main(String[] args) {
		Copyconstructor c1=new Copyconstructor(100,"Tharun");
		Copyconstructor c2= new Copyconstructor(c1);
		c2.cost=200;
		c2.s="Nani";
		c1.display();
		c2.display();
	}
}
