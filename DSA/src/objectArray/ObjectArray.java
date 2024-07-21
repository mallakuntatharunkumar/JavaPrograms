package objectArray;

public class ObjectArray {
	public static void main(String[] args) {
		Object[] o=new Object[5];
		o[0]=100;
		o[1]=12.2;
		o[2]=true;
		o[3]="Tharun";
		for(Object obj:o) {
			System.out.println(obj);	
		}
	}

}
