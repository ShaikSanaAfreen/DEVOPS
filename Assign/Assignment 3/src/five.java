import java.util.Arrays;
import java.util.Scanner;

public class five {

	   public static void main(String args[]) {
		      String[] myArray = {};
		      int n;
		      Scanner sc = new Scanner(System.in);
		      n = sc.nextInt();
		      
		      int size = n;
		      for(int i=0;i<n-1;i++) {
		    	  myArray[i] = sc.nextLine();
		      }
		      
		      for(int i = 0; i<size-1; i++) {
		         for (int j = i+1; j<myArray.length; j++) {
		            if(myArray[i].compareTo(myArray[j])>0) {
		               String temp = myArray[i];
		               myArray[i] = myArray[j];
		               myArray[j] = temp;
		            }
		         }
		      }
		      System.out.println(Arrays.toString(myArray));
		   }
}
