package primitiveCasting;

public class Demo {
	public static void main(String[] args) {
		System.out.println("---widening---");
		int a =10;
		double b= a;
		
		System.out.println(a+" "+b);
		char c='A';
		int d = c;
		System.out.println(c+" "+d);
		
		System.out.println("---Narrowing---");
		double x= 3.45;
		int y = (int)x;
		System.out.println(y);
		
		int p = 66;
		char q=(char)p;
		System.out.println(p+" "+q);//66 B
		System.out.println("A"+"B");//AB
		
		System.out.println("A"+20);//A20
		System.out.println('A'+'B');//131
		System.out.println('a'+20);//117
		System.out.println('a'+"a");//aa
	}
}

//ASCII->American standarded code for information interchange
//A->65
//a->97