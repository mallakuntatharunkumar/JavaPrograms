package lambdaExpressions;

import java.util.function.Function;
import java.util.function.Predicate;

public class EmpDriver_2 {
	public static void main(String[] args) {

		Emp e1 = new Emp("Tharun", 21, 30000);
		Emp e2 = new Emp("Nani", 22, 14000);
		Emp e3 = new Emp("Bablu", 23, 35000);
		Emp e4 = new Emp("Tommy", 24, 26000);
		Emp e5 = new Emp("Pspk", 25, 300000);

		Emp[] e = { e1, e2, e3, e4, e5 };
		Predicate<Emp> p = i -> i.sal >= 30000;
		Function<Emp, Integer> f = i -> (i.sal * 20) / 100;
		for (Emp n : e) {
			if (p.test(n)) {
				int bonus = f.apply(n);
				System.out.println(bonus);
				System.out.println(n);
			}
		}

	}

}