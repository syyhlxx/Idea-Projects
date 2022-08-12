package reviewMaterials;

/* int[][] result = new int[10][];
 * "You simply omit the second dimension
 *  and the Java machine creates a container of
 *  containers. 
 * */

public class TriangularArrays {
	
	public static void main(String[] args) {
		
		 //final int HEIGHT = 10;

		    // allocate triangular array
		    int[][] result = new int[10][];
		    for (int i = 0; i < 10; i++)
		    	result[i] = new int[i+1];

		    // fill triangular array
		    for (int i = 1; i < result.length; i++)
		      for (int j = 0; j < result[i].length; j++)
		    	  result[i][j] = i+j;

		    // print triangular array
		    for (int i = 0; i < result.length; i++) {
		      for (int j = 0; j < result[i].length; j++){
		        System.out.print(result[i][j] + " ");  
		      }
		      System.out.println();		
		    }
  }	
}
/* Create a 4 dimensional array
 * int[][][][] matrix = new int[2][3][4][5];
 * 
 * int[][][][] matrix;
	matrix = new int[2][][][];                 // Create a 2-element array of references to references to references
	for (int i = 0; i < matrix.length; i++)	   // references to references.
	{
  	matrix[i] = new int[3][][];                // Create a 3-element array of references to references
  	for (j = 0; j < matrix[i].length; j++)	   // references.	
  	{
    matrix[i][j] = new int[4][];               // Create a 4-element array of references
    for (k = 0; k < matrix[i][j].length; k++)
      matrix[i][j][k] = new int[5];            // Create 5-element arrays of integers
  }
}
 * 
 * 
 * */
 