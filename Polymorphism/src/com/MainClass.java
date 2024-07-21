package com;

public class MainClass {
	void invoke(Employee obj) {
		obj.work();
	}
	public static void main(String[] args) {
		MainClass m = new MainClass();
		m.invoke(new Tester());
		m.invoke(new Developer());
	}

}
