package threads;
class MyThre extends Thread{
	public void run(){
		for(int i=1;i<=10;i++) {
			System.out.println("Child"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
		
	}
}
public class Test6 {
	public static void main(String[] args)  {
		
		MyThre t1=new MyThre();
		t1.setDaemon(true);
		t1.start();
		for(int i=1;i<=5;i++) {
			System.out.println("Main"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
