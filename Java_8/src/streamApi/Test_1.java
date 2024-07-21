package streamApi;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
public class Test_1 {
	public static void main(String[] args) {
		List<Integer> L = new ArrayList<Integer>();
		L.add(1);
		L.add(2);
		L.add(3);
		L.add(4);
		L.add(5);
		L.add(6);
		L.add(7);
		Function<Integer, Integer> f = (a) -> a + 5;
		Consumer<Integer> c = (a) -> System.out.println(a);
		Stream<Integer> s = L.stream().map(f);
		s.forEach(c);
//		s.map(f).forEach(c);
	}
}
