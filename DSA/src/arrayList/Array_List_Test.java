package arrayList;

public class Array_List_Test {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(8);
		a.add(9);
		a.add(10);
		a.add(11);
		a.add(12);
		
		System.out.println(a.get(10));
		
		System.out.println("Removed"+a.remove(3));
		 a.addpos(100, 3);
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println("Size:"+a.size());
	}
}