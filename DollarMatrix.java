package reviewMaterials;

public class DollarMatrix {
	
	public static void printMoney() {
		
		int num1 = 1;
		
		while(num1 <= 10) {		
		 System.out.print("$");
		 num1++;		
		}
	}
	
	public static void main(String[] args) {
		
	int count = 1;
	
		while(count <= 10) {		
			printMoney();
			System.out.println("");
			 count++;	
			 
			}
	}
	
}
