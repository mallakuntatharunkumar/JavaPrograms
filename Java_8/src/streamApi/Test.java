package streamApi;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Test {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		l.add(30);
		l.add(35);
		Predicate<Integer> p = (a) -> a % 2 != 0;
		Stream<Integer> s = l.stream();
		List<Integer> eList = s.filter(p).collect(Collectors.toList());
		System.out.println(eList);
	}
}
