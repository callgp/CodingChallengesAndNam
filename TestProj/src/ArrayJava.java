import java.util.Arrays;

public class ArrayJava {
   public static void bubbleSort(int[] arr) {
      int j = 0;
      int tmp;
      boolean sorted = false;
      while (!sorted) {
         sorted = true;
         j++;
         for (int i = 0; i < arr.length - j; i++) {
            if (arr[i]%5==0&&arr[i]%6==0) {
               System.out.println("SixFive ");
            }else if (arr[i]%5==0) {
            	System.out.println("Five ");
			}else if (arr[i]%6==0) {
				System.out.println("Six ");
			}else {
				System.out.println(" same value is "+arr[i]);
			}
         }
      }
   }
   public static void main(String[] args) {
      int[] thisIsAnIntArray = { 5, 1, 100, 50, 75, 12, 89, 51, 11, 28, 99 };
      bubbleSort(thisIsAnIntArray);
      System.out.println(Arrays.toString(thisIsAnIntArray));
   }
}