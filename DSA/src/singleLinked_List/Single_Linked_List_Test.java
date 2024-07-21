package singleLinked_List;

public class Single_Linked_List_Test {
	public static void main(String[] args) {
		Single_Linked_List sL=new Single_Linked_List();
		sL.add(10);
		sL.add(20);
		sL.add(30);
		sL.add(90);
		sL.add(10);
		System.out.println("----Before------");
		System.out.println("Size:"+sL.size());
		for(int i=0;i<sL.size();i++) {
			int e=(Integer)sL.get(i);
			System.out.println(e);
		}
//		sL.addElement(3, 35);
//		sL.remove(2);
//		sL.remove(1);
		sL.reverse();
		System.out.println("-----After-----");
		System.out.println("Size:"+sL.size());
		
		for(int i=0;i<sL.size();i++) {
			int e=(Integer)sL.get(i);
			System.out.println(e);
		}
		
		
	}

}
