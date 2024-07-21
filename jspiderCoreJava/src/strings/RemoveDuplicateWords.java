package strings;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		String s="Banglore is a Banglore city".toLowerCase();
		
		String[] sarr=s.split(" ");
		for(int i=0;i<sarr.length;i++)
		{	
			String s3="banglore";
			if(sarr[i].equals(s3)) {
				s.replace("banglore", " ");
			}
			for(String s2:sarr) {
				System.out.println(s2);
			}
			System.out.println("----------------");
		}
		
	}

}
