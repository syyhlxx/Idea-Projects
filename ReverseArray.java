package reviewMaterials;

public class ReverseArray {
	
	public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        //write your code here
    	int[]tmpArray = new int[array.length];
    	int j = 0;
    	for(int i = array.length-1; i >= 0; i--) {  	
    		tmpArray[j++] = array[i];   		
    	}
    	
    	for(int i =0 ; i < array.length; i++) {  	
    		array[i] = tmpArray[i];   		
    	}	
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

}
