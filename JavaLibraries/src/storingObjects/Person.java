package storingObjects;

public class Person {
	int id;
	String name;
	
	public Person(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return "Age:"+id+" name:"+name;
	}

	public static void main(String[] args) {
		Person s1 = new Person(10,"Tharun");
		Person s2 = new Person(20,"manoj");
		
		Person[] p = new Person[2];
			p[0]=s1;
			p[1]=s2;
			for(int i =0;i<p.length;i++) {
				System.out.println(p[i]);
			}
	}

}
