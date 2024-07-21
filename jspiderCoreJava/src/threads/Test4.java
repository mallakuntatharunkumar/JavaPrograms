package threads;
class MyT extends Thread{
	public void run() {
		Thread.currentThread().getPriority();
		System.out.println(Thread.currentThread().getPriority()+" =child Thread");
	}
}
public class Test4 {
	public static void main(String[] args) {
		MyT t1= new MyT();
		t1.start();
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getPriority()+" =Main thread");
	}
}
