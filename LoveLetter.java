package reviewMaterials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoveLetter {
	
	public static void main(String[] args) {
	String name = "";
	
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
	 try {
			name = reader.readLine();
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	 
	for(int num1 = 0; num1 <10; num1++)	{
	 System.out.println( name + " loves me.");
	}
	
 }
	
}
