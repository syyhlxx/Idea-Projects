package reviewMaterials;

public class DrawingLines {
	
	
public static void printRows(int value) {		
		
		int numberOfRows = value;
	
			for(int count = 1; count <= numberOfRows;count++) {	
			 System.out.print(8);
			 	
			}
		}
		
public static void printColumns(int value) {
		
	int numberOfColumns = value;
	
		for(int count = 1; count <= numberOfColumns; count++) {	
		 System.out.println(8);
		}	
  }


	public static void main(String[] args) {
	
			printRows(10);
			System.out.println(" ");
			printColumns(10);			
 
    }
	
}