package strings;

public class StringObjConcept {
	public static void main(String[] args) {
		String s1=new String("Java");
		String s2=new String("Java");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);//Object references are compared
		System.out.println(s1.equals(s2));//Values are compared
		String s3="Java";
		String s4="Java";
		String s5="Java";
		System.out.println(s1+" "+s2+" "+s3);
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		
		String str="developer";
		System.out.println(str.indexOf("e"));
		System.out.println(str.indexOf("lop"));
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf('e',4));
		System.out.println(str.indexOf("ev",4));
		System.out.println(str.replace('e', '@'));
		System.out.println(str.replace("lop", "L@p"));
	}

}
