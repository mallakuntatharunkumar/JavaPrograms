package arrayList;

class ArrayList {
	  Object[] obj=new Object[10];
	 int count=0;
	 
	public void add(Object ele) {
		if(count==obj.length) {
			increase();
		}
		obj[count]=ele;
		count++;
	}
//	-------add()-----
	
	
		public void increase(){
			Object[] a=new Object[obj.length+5];
			for(int i=0;i<obj.length;i++) {
				a[i]=obj[i];
			}
			obj=a;
		}
//	------incrase-------
		
	
		public int size() {
			return count;
		}
//		------size()
		
		
		public Object get(int index) {
			if(index<0||index>=size()) {
				throw new ArrayIndexOutOfBoundsException();
			}
			
			return obj[index];
		}
//		------get()----
		
		
		public void set(Object val,int index) {
			if(index<0||index>=size()) {
				throw new ArrayIndexOutOfBoundsException();
			}
			obj[index]=val;
			
		}
//		--------set()-------
		
		
		public void addpos(Object val, int index) {
			if(index<0||index>=size()) {
				throw new ArrayIndexOutOfBoundsException();
			}
			for(int i=size();i>index;i--) {
				obj[i]=obj[i-1];
			}
			obj[index]=val;
			count++;
		}
//		-----addpos()-----
		
		
		public Object remove(int index) {
			Object val=obj[index];
			if(index<0||index>=size()) {
				throw new ArrayIndexOutOfBoundsException();
			}
			for(int i=index+1;i<size();i++) {
				obj[i-1]=obj[i];
			}
			count--;
			return val;
		}
		
}















