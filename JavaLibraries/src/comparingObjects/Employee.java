package comparingObjects;

public class Employee {
	int id;
	double height;
	public Employee(int id, double height) {
		this.id = id;
		this.height = height;
	}
	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;
		return this.height==emp.height && this.id == emp.id;
	}
	public static void main(String[] args) {
		Employee e1 = new Employee(101,5.8);
		Employee e2 = new Employee(101,5.8);
		System.out.println(e1.equals(e2));
		System.out.println(new Employee(1,5.4).equals(new Employee(1,5.4)));
	}
	
}
