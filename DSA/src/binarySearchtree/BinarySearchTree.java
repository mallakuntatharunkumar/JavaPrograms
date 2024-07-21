package binarySearchtree;

public class BinarySearchTree {
	private Node root=null;
	public void add(int k) {
		root=addNode(root,k);
	}
	private Node addNode(Node n, int k) {
		if(n==null) {
			n=new Node(k);
			return n;
		}
		if(k<n.key) {
			n.left=addNode(  n.left,k);
		}
		else if(k>n.key) {
			n.right=addNode(n.right,k);
		}
		return n;
	}
	public Object display() {
		return root;
		
	}
	
}
