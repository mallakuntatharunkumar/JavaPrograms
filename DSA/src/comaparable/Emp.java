package comaparable;

public class Emp implements Comparable{
	String name;
	int id;
	double sal;
	Emp(String n,int i,double s){
		name=n;
		id=i;
		sal=s;
	}
	public int compareTo(Object arg) {
//		String s1=name;
//		String s2=((Emp)arg).name;
//		return s1.compareTo(s2);
		
		
//		int id1=id;
//		int i2=((Emp)arg).id;
//		return id1-i2;
		
		double sal1=sal;
		double sal2=((Emp)arg).sal;
		return (int) (sal1-sal2);
		
		
	}
	@Override
	public String toString() {
		return "name:"+name+" id:"+id+" salary"+sal;
	}
	
}
