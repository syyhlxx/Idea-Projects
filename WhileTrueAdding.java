package reviewMaterials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileTrueAdding {

	public static String number1 = "";
	public static int num1 = 0;
	
	
public static void main(String[] args) {
			
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	while(true) {
	 try {
			number1 = reader.readLine();
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
	 	num1 += Integer.parseInt(number1);
	 	if(Integer.parseInt(number1)==-1)
	 		break;
	}
	System.out.println(num1);
  }
 }
