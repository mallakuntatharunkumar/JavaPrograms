package singleLinked_List;

public class Single_Linked_List {
	private Node first = null;
	private int count = 0;

	public void add(Object e) {
		if (first == null) {
			first = new Node(e, null);
			count++;
			return;
		}
		Node curr = first;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = new Node(e, null);
		count++;
	}

	public Object get(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		Node curr = first;
		for (int i = 1; i <= index; i++) {
			curr = curr.next;
		}
		return curr.ele;
	}
	public int size() {
		return count;
	}
	public void remove(int index) {
		if(index<0||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			first=first.next;
			count--;
			return;
		}
		
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=curr.next.next;
		count--;
	}
	public void addElement(int index,Object e) {
		if(index<0||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		
		if(index==0) {
			first=new Node(e,first);
			count--;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
			
		}
		curr.next=new Node(e,curr.next);
		count++;
	}
	public void reverse() {
		Node prev=null;
		Node curr=first;
		Node next=null;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			
		}
		first=prev;
	}
}




















