package threads;

class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

}

public class Test1 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		Thread t2 = new Thread(t1);
		t2.run();
		for (int i = 65; i <= 75; i++) {
			System.out.println((char) i);
		}

	}
}
