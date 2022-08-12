package reviewMaterials;



/* Arrays.equals(name1, name2)
 * 
 * int[] x1 = {1, 2, 3};
   int[] x2 = {1, 2, 3};
   x1.equals(x2);
 * 
 * int[] x1 = {1, 2, 3};
   int[] x2 = {1, 2, 3};
   Arrays.equals(x1, x2);
 * 
 * 
 * int[] x1 = {1, 2, 3};
   int[] x2 = {1, 2, 3, 4};
   Arrays.equals(x1, x2);
   
 *
 *  
 *  Arrays.deepEquals(name1, name2)
 *  
 * int[][] x1 = {{1, 2, 3}, {4, 5, 6}};
   int[][] x2 = {{1, 2, 3}, {4, 5, 6}};

   x1.equals(x2);
 *
 *
 * int[][] x1 = {{1, 2, 3}, {4, 5, 6}};
   int[][] x2 = {{1, 2, 3}, {4, 5, 6}};

   Arrays.equals(x1, x2);
   
   
 *
 *
 *
 * int[][] x1 = {{1, 2, 3}, {4, 5, 6}};
   int[][] x2 = {{1, 2, 3}, {4, 5, 6}};

   Arrays.deepEquals(x1, x2);
 *
 *
 */
import java.util.Arrays;

public class ArrayComparisons {
	
	public static int[][] arrayFirst = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    public static int[][] arraySecond = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

    public static void main(String[] args) {
        System.out.println(Arrays.deepEquals(arrayFirst, arraySecond));
    }
	

}
