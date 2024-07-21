package MultiLevel;

public class Student {

	public static void main(String[] args) {
		Department d = new Department();
		System.out.println(d.Univercity);
		System.out.println(d.depName);
		System.out.println(d.collegeName);
		
		System.out.println("-----------");
		d.exams();
		d.fest();
		d.providePlacements();
	}

}
