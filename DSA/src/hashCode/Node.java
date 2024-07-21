package hashCode;

public class Node {
	Object key;
	Node next;

	public Node(int k) {
		key = k;
	}

	public Node(Object k, Node n) {
		key = k;
		next = n;

	}
}
