package stack;

import java.util.EmptyStackException;

public class StackCreation {
	Object[] arr=new Object[5];
	int count=0;
	
	public int size() {
		return count;
	}
	public int length() {
		return arr.length;
		
	}
	public void push(Object e) {
		if(count>=arr.length) increase();
		arr[count]=e;
		count++;
	}
	
	public void increase(){
		Object[] arr2=new Object[arr.length+5];
		for(int i=0;i<arr.length;i++) {
			arr2[i]=arr[i];
		}
		arr=arr2;
	}
	
	public Object peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return arr[count-1];
	}
	
	public Object pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		Object e=arr[--count];
		arr[count]=null;
		return e; 
		
	}
	public boolean isEmpty() {
		return size()==0;
		
	}

	
	
}
