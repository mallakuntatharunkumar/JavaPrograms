package stack;

public class StackCalls {
	public static void main(String[] args) {
		StackCreation sc= new StackCreation();
		sc.push(10);
		sc.push(20);
		sc.push(30);
		sc.push(40);
		sc.push(50);
		sc.push(60);
		System.out.println("Poped Element:"+sc.pop());
		System.out.println("Last element:"+sc.peek());
		System.out.println("Length:"+sc.length());
		System.out.println("Size:"+sc.size());
	}
}
