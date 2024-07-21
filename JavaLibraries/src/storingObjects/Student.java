package storingObjects;

public class Student {
	int id;
	String name;
	public Student(int id,String name) {
		this.id = id;
		this.name=name;
	}
	public static void main(String[] args) {
		Student s1 = new Student(10,"Tharun");
		Student s2 = new Student(20,"manoj");
		Student[] s = new Student[2];
		s[0]=s1;
		s[1]=s2;
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
			System.out.println(s[i].id+" "+s[i].name);
		}
	}

}
