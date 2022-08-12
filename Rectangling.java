package reviewMaterials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangling {
	
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
			
			 String number1 = "";
			 String number2 = "";
			 int num1 = 0;
			 int num2 = 0;
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				
			 try {
					number1 = reader.readLine();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			 
			 try {
					number2 = reader.readLine();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			 
			 num1 = Integer.parseInt(number1);
			 num2 = Integer.parseInt(number2);
			
		
	
		for(int count = 1;	count <= num1; count ++) {
				printRows(num2);
				System.out.println(" ");
		}
						
		}


}
