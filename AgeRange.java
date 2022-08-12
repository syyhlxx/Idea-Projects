package reviewMaterials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AgeRange {
	
 
 public static void main(String[] args) {
		
	 String name = "";
	 String number = "";
	 int num = 0;
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
	 try {
			name = reader.readLine();
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	 
	 try {
			number = reader.readLine();
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
 
	 num = Integer.parseInt(number);
 
	 if(num >  20  ) { 
	 System.out.println("18 is old enough");
	 }
 
	 else if (num <= 20) {	
	 //System.out.println(num);	 
	 }
}
 
}
