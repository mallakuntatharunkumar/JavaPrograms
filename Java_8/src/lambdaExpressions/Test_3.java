package lambdaExpressions;

import java.util.function.Predicate;

public class Test_3 {
	public static void main(String[] args) {
		Predicate<Integer> p=i->i>=20;
		System.out.println(p.test(10));
		System.out.println(p.test(20));
	}

}
