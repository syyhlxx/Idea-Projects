package reviewMaterials;


/*
 * First, you create a new array of the desired length
   Then you copy all the elements from the first array into it.
  "These are the two things that the Arrays.copyOf() method does.
   
   This is what calling it looks like:

   Type[] name2 = Arrays.copyOf(name, length);
   
  "This method does not change the existing array,
   but instead creates a new array and copies the elements of the old array into it."
 * 
 * 
 * Type[] name2 = Arrays.copyOfRange(name, first, last);
   "This method also creates a new array, but fills it with elements from an
   arbitrary place in the original array. Where first and last are the indices 
   of the first and last elements that should be put into the new array.
 * 
 * 
 * 	int[] x = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

	int[] x2 = Arrays.copyOfRange(x, 5, 10);
	String str2 = Arrays.toString(x2);
	
	The str2 variable contains the value
	"[16, 17, 18, 19, 20]"

	int[] x3 = Arrays.copyOfRange(x, 5, 15);
	String str3 = Arrays.toString(x3);
 * 
 * The str3 variable contains the value
   "[16, 17, 18, 19, 20, 0, 0, 0, 0, 0]"
 * 
 * */
import java.util.Arrays;

/*int[][] data = new int[2][5];
int[] row1 = data[0];
int[] row2 = data[1];*/

public class ArraySplit {
	

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11};

    public static void main(String[] args) {
        //write your code here
    	
    	
    	
    	 if(array.length %2 == 0) {
             
            int[] arraySub0 = Arrays.copyOfRange(array,0, array.length / 2);
         	int[] arraySub1 = Arrays.copyOfRange(array, array.length/2, array.length);
         	result[0] = arraySub0;
         	result[1] = arraySub1;
         	// System.out.println(Arrays.toString(arraySub0));
           	 //System.out.println(Arrays.toString(arraySub1));
         	
         	//result[0][0]= 
         }
         else{
        	 int[] arraySub0 = Arrays.copyOfRange(array,0, (array.length/ 2)+1);
        	 int[] arraySub1 = Arrays.copyOfRange(array, (array.length/2)+1,array.length);
        	 result[0] = arraySub0;
          	 result[1] = arraySub1;
          	 
        	// System.out.println(Arrays.toString(arraySub0));
          	// System.out.println(Arrays.toString(arraySub1));
         }
    	
        System.out.println(Arrays.deepToString(result));
    }

}
