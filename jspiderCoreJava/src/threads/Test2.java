package threads;

class MyTh extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

}

public class Test2 {
	public static void main(String[] args) {
		MyTh t1 = new MyTh();
		t1.start();
		for (int i = 65; i <= 75; i++) {
			System.out.println((char) i);
		}

	}
}
