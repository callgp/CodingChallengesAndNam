
public class MaxBlock {

	/*
	 * axBlock("hoopla") → 2 0 X maxBlock("abbCCCddBBBxx") → 3 0 X maxBlock("")
	 * → 0 0 OK maxBlock("xyz") → 1 0 X maxBlock("xxyz") → 2 0 X
	 * maxBlock("xyzz") → 2 0 X maxBlock("abbbcbbbxbbbx") → 3 0 X
	 * maxBlock("XXBBBbbxx") → 3 0 X maxBlock("XXBBBBbbxx") → 4 0 X
	 * maxBlock("XXBBBbbxxXXXX") → 4 0 X maxBlock("XX2222BBBbbXX2222") → 4 0
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("value is-->" + maxBlock("hoopla"));
		System.out.println("value is-->" + maxBlock("XXBBBBbbxx"));//index 8 is x index 9 is x
	

	}

	public static int maxBlock(String str) {
		/*int count = 1;
		int maxCount = 1;
		System.out.println("str lenght is-->" + str.length());
		if (str.length() == 0) {
			return 0; 	
		}
		for (int i = 0; i < str.length()-1; i++) {//comes till max i =8
			if (str.charAt(i)==str.charAt(i + 1)) {
				count++;
				System.out.println("count is==>"+count);
			}
			else{
				count=1;//count=1;
			}
			if (count > maxCount) {
				maxCount = count;
				count = 0;
			}

		}
		return count;*/
		
		
		//public int maxBlock(String str) {
			  int len = str.length();
			  int count = 0;
			  int tmpcount = 1;
			  
			  if (len == 0)
			    return 0;
			  
			  for (int i = 0; i < len; i++) {
			    if (i < len-1 && str.charAt(i) == str.charAt(i+1))
			      tmpcount++;
			    else
			      tmpcount = 1;
			    
			    if (tmpcount > count)
			      count = tmpcount;
			  }
			  return count;
			}

		/*
		 * int maxCounter = 1; int counter = 1; if (str.length() == 0) { return
		 * 0; } for (int i = 0; i < str.length() - 1; i++) { if
		 * (str.substring(i, i + 1).equals(str.substring(i + 1, i + 2))) {
		 * counter++;
		 * 
		 * } if (counter > maxCounter) { maxCounter = counter; counter = 0; } }
		 * 
		 * return maxCounter;
		 */
	}

