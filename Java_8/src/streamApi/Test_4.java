package streamApi;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
class Employee{
	int id;
	int salary;
	String name;
	public Employee(int id, int salary, String name) {
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
}
public class Test_4 {
	public static void main(String[] args) {
		List<Employee> L1=new ArrayList<Employee>();
		L1.add(new Employee(101,40000,"Tharun"));
		L1.add(new Employee(102,50000,"Nani"));
		L1.add(new Employee(103,60000,"Bablu"));
		Function<Employee,Integer> f=(e)->{ 
			e.salary=e.salary+500;
			return e.salary;
		};
		Consumer<Integer> c=(a)->System.out.println("Tharun:"+a);
		List<Integer> l=L1.stream().filter((e)->e.salary>=40000).map(f).collect(Collectors.toList());
		System.out.println(l);
		l.forEach(c);
		l.forEach(System.out::println);
	}
}