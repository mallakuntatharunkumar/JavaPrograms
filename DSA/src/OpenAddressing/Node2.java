package OpenAddressing;

public class Node2 {
	private Node[] arr = new Node[10];
	private int count = 0;

	public boolean add(int k) {
		int index = k % arr.length;
		if (arr[index] == null) {
			arr[index] = new Node(k, null);
			count++;
			return true;
		}
		Node prev = null;
		Node curr = arr[index];
		while (curr != null) {
			if (curr.key == k)
				return false;
			prev = curr;
			curr = curr.next;
		}
		prev.next = new Node(k, null);
		count++;
		return true;
	}

	public void display() {

		for (int i = 0; i < arr.length; i++) {
			Node curr = arr[i];

			while (curr != null) {
				System.out.print(curr.key+" ");
				curr = curr.next;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Node2 n=new Node2();
		n.add(10);
		n.add(20);
		n.add(30);
		n.add(40);
		n.add(50);
		n.add(60);
		n.add(70);
		n.add(80);
		n.add(99);
		n.add(11);
		n.add(22);
		n.add(32);
		n.add(44);
		n.add(52);
		n.add(66);
		n.add(75);
		n.add(89);
		n.add(99);
		n.display();
	}
}
