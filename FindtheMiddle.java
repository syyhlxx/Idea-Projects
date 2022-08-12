package reviewMaterials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindtheMiddle {
		 
	 public static String number1 = "";
	 public static String number2 = "";
	 public static String number3 = "";
	 
	 public static int num1 = 0;
	 public static int num2 = 0;
	 public static int num3 = 0;
	 public static int maxInt = 0;
	 public static int minInt = 0;
	 public static int middleInt = 0;
	 
	 public static int[] anArray = new int[3];
	 
	 
	 public static void checkForMiddle() {
		 
		 if(num2 > num1 && num1 > num3 || num3 > num1 && num1 > num2) 
			 System.out.println(num1);
		 
		 if(num1 > num2 && num2 > num3 || num3 > num2 && num2 > num1)
			 System.out.println(num2);
		 
		 if(num1 > num3 && num3 > num2 || num2 > num3 && num3 > num1)
			 System.out.println(num3);
	 }
	 
public static void isTheMiddle() {
	for(int i = 0;i<anArray.length;i++) {
		if(anArray[i]< maxInt && anArray[i]> minInt) {
			middleInt = anArray[i];
			System.out.println(middleInt);
		}		
	}	
}

public static void isTheMax() {
	
	maxInt = Math.max(anArray[0], anArray[1]);
	maxInt = Math.max(maxInt, anArray[2]);
			
}
	
public static void isTheMin() {
	minInt = Math.min(anArray[0], anArray[1]);
	minInt = Math.min(minInt, anArray[2]);
}

public static void sortInt() {
	
	if(areAllEqual())
	{
		
	}
	else if(areTwoEqual()) {
		
	}
		//isTheMax();
		//isTheMin();
		//isTheMiddle();
	checkForMiddle();
		
	//showAllValues();	
}
public static void showAllValues() {
	System.out.println("Max is " + maxInt);	
	System.out.println("Middle is " + middleInt);	
	System.out.println("Min is " + minInt);	
}

public static Boolean areAllEqual() {
	Boolean flag = false;
	
	if(anArray[0] == anArray[1] && anArray[0] == anArray[2]) {
		System.out.println(anArray[0]);	
		flag = true;
	}
		return flag;
}
	
public static Boolean areTwoEqual() {
	Boolean result = false;
	//System.out.println("You are here");
	
	if(anArray[0] == anArray[1]) {
		
		System.out.println(anArray[0]);
		//System.out.println(anArray[1]);
		result = true;
	}
	
	else if(anArray[1] == anArray[2]){	
		System.out.println(anArray[1]);
		//System.out.println(anArray[2]);
		result = true;
	}
	
	else if(anArray[2] == anArray[0]) {
		System.out.println(anArray[2]);
		//System.out.println(anArray[0]);
		result = true;
	}
	
	return result;
}
	
	
	public static void main(String[] args) {
		
				
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
		 
		 try {
				number3 = reader.readLine();
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		 
		 num1 = Integer.parseInt(number1);
		 num2 = Integer.parseInt(number2);
		 num3 = Integer.parseInt(number3);
		 
		 anArray[0]= num1;
		 anArray[1]= num2;
		 anArray[2]= num3;
		 
		 sortInt();
		 //checkForMiddle();
		 
		 
		/*if(areAllEqual()) {
		}
		if(areTwoEqual()) {
		}
		else if(!areTwoEqual() && !areAllEqual()) {
			System.out.println(middleInt);
		}*/
    }
}
