package queue;

public class QueueDecloration {
	Node first = null;
	Node last = null;
	int count = 0;

	public void add(Object e) {
		if (first == null) {
			first = new Node(e, null);
			last = first;
			count++;
			return;
		}

		last.next = new Node(e, null);
		last = last.next;
		count++;
	}

	public int size() {
		return count;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public Object pull() {
		if (isEmpty()) {
			return null;
		}
		Object e = first.ele;
		first = first.next;
		count--;
		if (first == null) {
			last = null;
		}
		return e;
	}

	public Object peek() {
		if (isEmpty()) {
			return null;
		}
		Object e = first.ele;
		return e;

	}
}
