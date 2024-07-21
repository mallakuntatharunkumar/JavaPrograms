package hashCode;
//Separate Chaining
public class Set {
	private Node[] arr = new Node[10];
	private int count = 0;

	public boolean add(Object k) {
		int hc = (int) k;
		hc = Math.abs(hc);
		int index = hc % arr.length;
		if (arr[index] == null) {
			arr[index] = new Node(k, null);
			count++;
			return true;
		}
		Node prev = null;
		Node curr =arr[index];
		while (curr != null) {
			if (k.equals(curr.key))
				return false;
			prev = curr;
			curr = curr.next;
		}
		prev.next = new Node(k, null);
		count++;
		return true;
	}
	public void display() {
		for(int i=0;i<arr.length;i++) {
		Node curr=arr[i];
		while(curr!=null) {
			System.out.print(curr.key+" ");
			curr=curr.next;
		}
		System.out.println();
		}
	}
}
