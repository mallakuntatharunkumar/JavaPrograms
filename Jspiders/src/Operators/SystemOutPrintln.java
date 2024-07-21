package Operators;

public class SystemOutPrintln {
	public static void main(String[] args) {
		int a=20,b=40;
		System.out.println("1"+2+3);//123 the operation done by left to right
		System.out.println(2+3+"1");//51
		System.out.println("1"+(2+3));//15
		System.out.println(1/2*10*20);//0
		System.out.println('1'+2+3);//49 asci value for 1 ,//54
		System.out.println('1');//1
		System.out.println((int)'1');//49
		System.out.println('1'+2);//51
		System.out.println('1'+"3");//13
		System.out.println(a+"+"+b+"="+(a+b));//20+40=60
		System.out.println(a+"+"+b+"="+a+b);//20+40=2040
		System.out.println("Raj"+"\t"+98);
		System.out.println("Tharun"+"\t"+99);
		System.out.println(2*4+(5+4)/10);
	}
}
//BodMAS
