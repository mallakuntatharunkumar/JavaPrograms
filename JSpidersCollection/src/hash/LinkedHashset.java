package hash;
import java.util.*;
public class LinkedHashset {
	public static void main(String[] args) {
		HashSet h= new LinkedHashSet();
		h.add("Ram");
		h.add("sita");
		h.add(null);
		h.add("Laxman");
		h.add("Ram");
		h.add("Hanuman");
		h.add(null);
		h.add("Laxman");
		//h.add(10);
//		h.remove("Ram");
//		h.remove(10);
		System.out.println(h);
	}


}