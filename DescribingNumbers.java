package reviewMaterials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DescribingNumbers {
	
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
		 if (num1 == 0 || num1 > 999 || num1 <0) {
			 //System.out.println("Zero");
		 }
	 
		 //"Even single-digit number" - if the number is even and has one digit
		 else if(num1 % 2 == 0 && num1 <= 9 ) {	
			 System.out.println("Even single-digit number");
		 }
		 
		 //"Odd single-digit number" - if the number is odd and has one digit,
		 else if ( num1 % 2 == 1 && num1 <= 9 ) {
			 System.out.println("Odd single-digit number");
		 }
		 
		 //"Even two-digit number" - if the number is even and has two digits,
		 else if (num1 % 2 == 0 && num1 <= 99 ) {
			 System.out.println("Even two-digit number");
		 }
		
		 //"Odd two-digit number" - if the number is odd and has two digits,
		 else if (num1 % 2 == 1 && num1 <= 99) {		
			 System.out.println("Odd two-digit number");
		 }
		 //"Even three-digit number" - if the number is even and has three digits,
		 else if (num1 % 2 == 0 && num1 <= 999) {		
			 System.out.println("Even three-digit number");
		 }
		//"Odd three-digit number" 
		 else if (num1 % 2 == 1 && num1 <= 999) {		
			 System.out.println("Odd three-digit number");
		 }
		
		}

}
