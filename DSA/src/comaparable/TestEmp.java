package comaparable;

import java.util.Arrays;

public class TestEmp {
	public static void main(String[] args) {
		Emp[] arr= {new Emp("Tharun",106,9000),new Emp("Ramana",102,90000),new Emp("Kishore",103,10000),new Emp("Ankitha",105,8000)
	};
		Arrays.sort(arr);
		for(Emp e:arr) {
			System.out.println(e);
		}
}
}
