package reviewMaterials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PositiveAndNegativeNumbers {
	
	public static void main(String[] args) {
	
	 String number1 = "";
	 String number2 = "";
	 String number3 = "";
	 int num1 = 0;
	 int num2 = 0;
	 int num3 = 0;
	 
	 int positives = 0;
	 int negatives = 0;
	
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
	 
	 try {
			number3 = reader.readLine();
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	 	 
	 num1 = Integer.parseInt(number1);
	 num2 = Integer.parseInt(number2);
	 num3 = Integer.parseInt(number3);
	 
	  if (num1 > 0 ) {	 
		  positives++;
	  }
	  if (num2 > 0 ) {	 
		  positives++;
	  }
	  if (num3 > 0 ) {	 
		  positives++;
	  }
	  
	  if (num1 < 0 ) {	 
		  negatives++;
	  }
	  if (num2 < 0 ) {	 
		  negatives++;
	  }
	  if (num3 < 0 ) {	 
		  negatives++;
	  }
	  
	  System.out.println("Number of negative numbers: " + negatives);
	  System.out.println("Number of positive numbers: " + positives);
	  
	}
	
}