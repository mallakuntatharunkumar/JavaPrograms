package lambdaExpressions;

import java.util.function.Consumer;
import java.util.function.Function;

public class EmpDriver_3 {
	public static void main(String[] args) {
		Emp e1= new Emp("Tharun",21,30000);
		Emp e2= new Emp("Nani",22,14000);
		Emp e3= new Emp("Bablu",23,35000);
		Emp e4= new Emp("Tommy",24,26000);
		Emp e5= new Emp("Pspk",25,300000);
		
		Emp[] e= {e1,e2,e3,e4,e5};
		Consumer<Emp> c=i->System.out.println(i.name+" "+i.age);
		Function<Emp, Integer> f=i->{
			if(i.sal>=25000) {
				int bonus=(i.sal*30)/100;
				return bonus;
			}
			else {
				int bonus=(i.sal*20)/100;
				return bonus;
			}
		};
		for(Emp n:e) {
			
			int bonus=f.apply(n);
			System.out.println("Bonus: "+bonus +" for Salary "+n.sal);
			c.accept(n);
		}
		
	}
}
