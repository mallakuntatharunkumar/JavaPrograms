package storingObjects;

public class Employee {
	public int hashCode(int id) {
		return id;
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e.hashCode(12344));
		System.out.println(e);
	}

}
