package basics;

public class NonStaticA {
	int i;
	int j;
	
	public static void main(String[] args) {
		NonStaticA n = new NonStaticA();
		n.i=10;
		n.j=20;
		System.out.println(n.i);
		System.out.println(n.j);
		System.out.println(n.i=30*n.j);
		System.out.println("________________________");
		NonStaticA m= new NonStaticA();
		m.i=25;
		m.j=36;
		System.out.println(m.i+" "+m.j);
		
		
		}

}

