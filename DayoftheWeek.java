package reviewMaterials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayoftheWeek {
	
	 
	
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
	 
	 if(num1 > 7 || num1 < 1 ) {
		 
		 System.out.println("No such day of the week");
	 }
	 
	 else if (num1 == 1) {
		
		 System.out.println("Monday");
		 
	 }
	 else if (num1 == 2) {
	
		 System.out.println("Tuesday");
	 }
	 else if (num1 == 3) {
		
		 System.out.println("Wednesday");
	 }
	 else if (num1 == 4) {
		
		 System.out.println("Thursday");
	 }
	 else if (num1 == 5) {
		
		 System.out.println("Friday");
	 }
	 else if (num1 == 6) {
		
		 System.out.println("Saturday");
	 }
	 
	 else if (num1 == 7) {
		 
		 System.out.println("Sunday");
	 }	 

	 }
}