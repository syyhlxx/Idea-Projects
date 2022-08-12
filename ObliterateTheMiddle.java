package reviewMaterials;

public class ObliterateTheMiddle {
	
	//ranges are [4][6]
	 public static char[][] chars = {
			 
	            {'a', 'b', 'c', 'd', 'e', 'f'},
	            {'j', 'h', 'i', 'j', 'k', 'l'},
	            {'m', 'n', 'o', 'p', 'q', 'r'},
	            {'s', 't', 'u', 'v', 'w', 'x'}};
	 
	 public static void main(String[] args) {
		 
		 
		 printArray();
		 
		 for(int j=1; j<chars.length-1;j++) {
			 for(int k=1;k <chars[j].length -1;k++) {
				 chars[j][k]= '-';
			 }
		 }
		 
		 printArray();
		 
	    }

	    private static void printArray() {
	        for (int i = 0; i < chars.length; i++) {
	            for (int j = 0; j < chars[i].length; j++) {
	                System.out.print(chars[i][j] + " ");
	            }
	            System.out.println();
	        }
	        System.out.println();
	    }
		 
		 
	 }
	 	
