package reviewMaterials;

import java.util.Arrays;

/*
 *  int[] array = {1, 2, 3};
	String str = Arrays.toString(array);
 * 
 * int[] array = {};
   String str = Arrays.toString(array);
 * 
 * 
 * String[] array = {"Hi", "How's", "life?"};
   String str = Arrays.toString(array);
 */


public class DisplayingArrays {
	
	public static String[] strings = new String[]{"I", "love", "Java"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

    public static void main(String[] args) {
        //write your code here
    	
    	System.out.println(Arrays.toString(strings));
    	System.out.println(Arrays.toString(ints));
    }

}
