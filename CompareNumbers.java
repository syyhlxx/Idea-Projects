package reviewMaterials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareNumbers {
	
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
	 
	 if(num2 >  num1  ) {
		 
		 System.out.println(num1);
	 }
	 
	 else if (num1 > num2) {
		
		 System.out.println(num2);
		 
	 }
	 else if (num1 == num2) {
			
		 System.out.println(num1);
	
	 }
	}
}
