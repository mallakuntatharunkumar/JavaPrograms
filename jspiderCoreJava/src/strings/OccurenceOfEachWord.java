package strings;

import java.util.Arrays;

public class OccurenceOfEachWord {
	public static void main(String[] args) {
	String s="cat mat bat cat mat cat".toLowerCase();
	String[] s1=s.split(" ");
	System.out.println(Arrays.toString(s1));
	for(int i=0;i<s1.length;i++) {
		int count=1;
		if(s1[i]== null) continue;
		for(int j=i+1;j<s1.length;j++) {
			if(s1[i].equals(s1[j])) {
				count++;
				s1[j]=null;
			}
		}
		System.out.println(s1[i]+":"+count);
	}
	}
}
