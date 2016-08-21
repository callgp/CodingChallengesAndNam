
public class matchUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar1={1, 2, 3};
		int[] ar2={2, 3, 3};
		System.out.println("value is"+matchUp(ar1, ar2));

	}
	
	public static int matchUp(int[] nums1, int[] nums2) {
		  int count=0;
		  for(int i=0; i<nums1.length;i++){
		    if(Math.abs(nums1[i]-nums2[i])<=2){
		      count++;
		    }
		  }
		  return count;
		}


}
