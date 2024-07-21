package streamApi;
import java.util.*;
import java.util.stream.Stream;
class Student {
	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
}
public class Test_2 {
	public static void main(String[] args) {
		List<Student> l = new ArrayList();
		l.add(new Student(101, "Tharun", 81));
		l.add(new Student(102, "Nani", 34));
		Stream<Student> s1 = l.stream().filter(s -> s.marks <= 35);
		System.out.println(s1.count());
		System.out.println(l.stream().filter(s -> s.marks <= 35).count());
	}
}
