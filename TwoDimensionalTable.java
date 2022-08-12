package reviewMaterials;

/*Declare and populate a two
 * dimensional array.
 * int[][] arr = new int[n][n];
int inc=1;
for(int i=0;i<n;i++)
for(int j=0;j<n;j++)
{
arr[i][j]=inc;
inc++;
}*/


public class TwoDimensionalTable {
	public static int[][] TABLE = new int[10][10];
	
	public static void main(String[] args) {
	
	
	for(int j = 0;j < 10 ;j++) {		
		for(int k =0; k < 10;k++) {
		TABLE[j][k]= (j+1)*(k+1);
				
		}
	}
	
	//Generic two dimensional array display code.
	for(int j = 0;j < 10 ;j++) {		
		for(int k =0; k < 10;k++) {
			System.out.print(TABLE[j][k]+ " ");				
		}
		System.out.println("");
	}
	
  }
}
