package chaining;
import java.util.Scanner;
class Human {
	Human(int population){
		this();
		System.out.println("Population:"+population);
	}
	Human(){
		System.out.println("Human block");
	}
}
class Animal extends Human{
	Animal(String color){
		super(2500);
		System.out.println("Color:"+color);
	}
	Animal(int cost, String color){
		this(color);
		System.out.println("Cost:"+cost);
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter cost:");
		int x = sc.nextInt();
		
		System.out.println("Enter Color:");
		String y = sc.next();
		Animal a = new Animal(x,y);
	}
}
