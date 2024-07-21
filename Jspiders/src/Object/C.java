package Object;

public class C {
	int i;
	public static void main(String[] args) {
		C c1=new C();
		c1.i=10;
		C c2=new C();
		c2.i=20;
		c1.display();
		c2.display();
		
	}
	public void display() {
		C c=new C();
		System.out.println(c.i);
		System.out.println(i);
	}

}
