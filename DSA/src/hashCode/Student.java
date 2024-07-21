package hashCode;

public class Student {
	String name;
	int marks;
	public Student(String n,int m) {
		name=n;
		marks=m;
	}
	@Override
	public String toString() {
		return "name:"+name+" Marks:"+marks;
	}
	@Override
	public int hashCode() {
		return marks;
	}
	@Override
	public boolean equals(Object arg) {
		if(!(arg instanceof Student)) return false;
		Student s=(Student)arg;
		return name.equals(s.name)&&marks==s.marks;
		
	}
	public static void main(String[] args) {
		Student stu= new Student("Tharun", 99);
		System.out.println(stu);
		stu= new Student("Tharun", 99);
		System.out.println(stu);
	}
	
}
