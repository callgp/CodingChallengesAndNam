package ds.stack;

public class AppStackString {

	public static void main(String[] args) {
	/*	Stack theStack=new Stack(10);
		theStack.push(20);
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);
		theStack.push(20);
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);
		theStack.push(20);
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);
		
		while(!theStack.isEmpty()){
			long value=theStack.pop();
			System.out.println(value);
		}

	}*/

	
		System.out.println("reversis-->"+reverseString("hello"));
	
	}
	
	
	public static String reverseString(String str){
		
		/*StackString s=new StackString(5);
		s.push('h');
		s.push('e');
		s.push('l');
		s.push('l');
		s.push('o');
		//s.push('e');
		while(!s.isEmpty()){
			long value=s.pop();
			System.out.println(value);
		}
		return str;*/
		
		int stackSize=str.length();
		StackString s=new StackString(stackSize);
		for(int j=0;j<str.length();j++){
			char ch=str.charAt(j);
			s.push(ch);
		}
		String result="";
		while(!s.isEmpty()){
			char ch=s.pop();
			result=result+ch;
			//System.out.println(value);
		}
		return result;
	}
}
