
public class Counter {
	private String str=null;
	private int count=0;

	public Counter(String str) {
		super();
		this.str = str;
	}
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
	}*/
	
	public void increment(){
		count++;
	}	
	public int getCurrentValue(){
		System.out.println(this.count);
		return count;
	}
	
	public String toString(){
		//
		//Counter counter=new Counter(str);
		//counter.toString();
		return str+"::"+count;
	}
	private void doSomething(){
		
	}

}
