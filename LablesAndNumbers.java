package reviewMaterials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LablesAndNumbers {
	
	public static void main(String[] args) {
	
	String number1 = "";
	int num1 = 0;
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	 try {
			number1 = reader.readLine();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	 
	 num1 = Integer.parseInt(number1);
	 if (num1 == 0)
		 System.out.println("Zero");
 
	 //"Negative even number" - if the number is negative and even,
	 else if(num1 % 2 == 0 && num1 < 0 ) {	
		 System.out.println("Negative even number");
	 }
	 
	 //"Positive even number" - if the number is positive and even,
	 else if ( num1 % 2 == 0 && num1 > 0 ) {
		 System.out.println("Positive even number");
	 }
	 
	 //"Negative odd number" - if the number is negative and odd,
	 else if (num1 % 2 == -1 && num1 < 0 ) {
		 System.out.println("Negative odd number");
	 }
	
	 //"Positive odd number" - if the number is positive and odd.
	 else if (num1 % 2 == 1 && num1 > 0) {		
		 System.out.println("Positive odd number");
	 }
	
	}
	

}
