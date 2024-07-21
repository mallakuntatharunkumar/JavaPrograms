package genrics;

import java.util.ArrayList;

class Test_Emp{
	public static void main(String[] args) {
		
		ArrayList<Employee> a= new ArrayList();
			Employee e1=new Employee("Tharun", 21);
			Employee e2=new Employee("Tharun kumar", 22);
			Employee e3=new Employee("Tharun royals", 23);
			a.add(e1);
			a.add(e2);
			a.add(e3);
			System.out.println(a);
			Employee e7=a.get(2);
			a.add(e7);
			System.out.println(a);
		
	}
}
