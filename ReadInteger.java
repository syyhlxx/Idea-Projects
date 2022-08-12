package reviewMaterials;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReadInteger {
	
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
		 
		 if(num1 > 0) {
			 num1= num1 + num1;
			 System.out.println(num1);
		 }
		 
		 else if (num1 < 0) {
			 num1 = num1 +1;
			 System.out.println(num1);
		 }
		 else {
			 System.out.println(0);
		 }
		 
    	
	}
}
