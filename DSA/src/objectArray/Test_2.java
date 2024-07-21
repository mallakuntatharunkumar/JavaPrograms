package objectArray;

interface Animal {
	
	void makeSound();
}

class Dog implements Animal {
	public void makeSound() {
		System.out.println("Bow Bow");
	}
}

class Cat implements Animal {
	public void makeSound() {
		System.out.println("Meow Meow");
	}

}

public class Test_2 {

	public static void main(String[] args) {

		Animal[] a = new Animal[3];
		a[0] = new Dog();
		a[1] = new Cat();
		a[2] = new Cat();

		for (Animal m : a) {
			m.makeSound();
		}
	}

}
