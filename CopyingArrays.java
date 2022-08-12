package reviewMaterials;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CopyingArrays {
	
	public static void main(String[] args) {
		
		String[] strings = new String[10];
	    int[] lengths = new int[10];
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		for(int k = 0; k < 10; k++) {
			
		 try {
				strings[k] = reader.readLine();
				lengths[k] = strings[k].length();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
		}
		
		for (int i = 0; i < 10; i++) {
		    System.out.println (lengths[i]);
		}
	}
}

/*BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
int[] motherShip = new int[20];
int[] jumper0 = new int[10];
int[] jumper1 = new int[10];
String number1 = "";
int num1 = 0;

for (int i = 0; i < 20; i++) {
    try {
        number1 = reader1.readLine();
        motherShip[i]  = Integer.parseInt(number1);
    } catch (IOException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
    }
}
for (int j = 0; j < 10; j++) {
    jumper1[i] = motherShip[i];
}
for (int k = 10; k < 20; k++) {
    jumper1[i-10] = motherShip[i];
}

//for (int i = 0; i < 20; i++) {
    //System.out.println (motherShip[i]);
//}
for (int i = 0; i < 10; i++) {
    System.out.println (jumper1[i]);
}
}*/