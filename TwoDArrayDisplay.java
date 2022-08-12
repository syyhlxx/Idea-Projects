package reviewMaterials;

import java.util.Arrays;

/*
 * 	int[][] data = new int[2][5];
	int[] row1 = data[0];
	int[] row2 = data[1];
 * 
 * 
 * 
 *  // Matrix of important data
    int[][] matrix = {
    {1, 2, 3, 4, 5},
    {5, 4, 3, 2, 1}
    };

   int[] tmp = matrix[0];
   matrix[0] = matrix[1];
   matrix[1] = tmp
 * 
 * 
 * int[] array = {1, 2, 3};
   String str = Arrays.deepToString(array);
 * 
 * int[][] array = { {1, 1}, {2, 2}, {3, 3} };
   String str = Arrays.deepToString(array);
   
   int[][][] array = { {{1, 2, 3}, {1}}, {{}} };
   String str = Arrays.deepToString(array);
 */

public class TwoDArrayDisplay {
	
    public static String[][] strings = new String[][]{{"🙂", "🙂", 
    	"🙂", "🙂"}, {"🙃", "🙃", "🙃", "🙃"}, {"😋", "😋", "😋",
    	"😋"}, {"😎", "😎", "😎", "😎"}};
    public static int[][] ints = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8},
    	{9, 10, 11, 12}, {13, 14, 15, 16}};

    public static void main(String[] args) {
        //write your code here
    	System.out.println(Arrays.deepToString(strings));
    	System.out.println(Arrays.deepToString(ints));
    }

}
