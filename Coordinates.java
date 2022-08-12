package reviewMaterials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coordinates {
	
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
		 
		 //number1 = reader.readLine();
		 //number2 = reader.readLine();

		 num1 = Integer.parseInt(number1);
		 num2 = Integer.parseInt(number2);
		 
		 //a>0 and b>0;
		 if(num2 >0 &&  num1 >0 ) {
			 System.out.println(1);
		 }
		 
		 //a<0 and b>0;
		 else if (num1 < 0 && num2 > 0) {
			 System.out.println(2);
			 
		 }
		 //a<0 and b<0;
		 else if (num1 < 0 && num2 < 0) {
			 System.out.println(3);
		
		 } 
		 //a>0 and b<0.
		 else if (num1 > 0 && num2 < 0) {
			 System.out.println(4);
		 }
		 
	}

}
