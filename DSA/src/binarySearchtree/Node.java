package binarySearchtree;

public class Node {
	int key;
	Node left;
	Node right;
	public Node(int k) {
		key=k;
	}
	public Node(int k,Node l,Node r) {
		key=k;
		left=l;
		right=r;
	}
	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		bst.add(10);
		bst.add(20);
		bst.add(30);
		bst.add(40);
		System.out.println(bst.display());
	}
}
