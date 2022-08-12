package reviewMaterials;

public class Trangling {
	
	public static void printRows(int value) {		
		
		int numberOfRows = value;
	
			for(int count = 1; count <= numberOfRows;count++) {	
			 System.out.print(8);
			 	
			}
		}
	
	
	public static void main(String[] args) {

	for(int count = 1;	count <= 10; count ++) {
			printRows(count);
			System.out.println(" ");
	}

}
	
}