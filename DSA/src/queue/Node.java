package queue;

public class Node {
	Object ele;
	Node next;
	public Node(Object e,Node n) {
		ele=e;
		next=n;
	}
	public static void main(String[] args) {
		QueueDecloration qd=new QueueDecloration();
		qd.add(10);
		qd.add(20);
		qd.add(30);
		qd.add(40);
		qd.add(50);
		System.out.println("Removed:"+qd.pull());
		
		System.out.println("Fisrt element:"+qd.peek());
		System.out.println("Size:"+qd.size());
	}

}
