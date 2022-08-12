package reviewMaterials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AGoodThing {
	
	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		 String str1 = "";
		 String number1 = "";
		 int num1 = 0;
	
		 try {
				str1 = reader.readLine();
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		 
		 try {
				number1 = reader.readLine();
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		 
		 num1 = Integer.parseInt(number1);
		 
		 while(num1 > 0) {
			 
			 System.out.println(str1); 
			 num1--;
			 
		 }
	}
}
