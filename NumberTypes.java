package reviewMaterials;

public class NumberTypes {
	
	 private static String UNEXPECTED_TYPE = "I didn't expect this type of number!";

	    public static void main(String[] args) {
	        System.out.println(toCustomString((byte) 12));
	        System.out.println(toCustomString(12));
	        System.out.println(toCustomString(12.));
	        System.out.println(toCustomString(12L));
	    }

	    public static String toCustomString(Number number) {
	    	
	    	String result = "";
	    	int thisIsInt = 0;
	    	double doubleTrouble = 0.0;
	    	byte byteMe = 0;
	    
	    	if(number instanceof Double) {   		
	    		doubleTrouble = (double) number *20;
	    		return result += result.valueOf(doubleTrouble);
	    	}
	    	else if(number instanceof Integer) {
	    		thisIsInt = (int)number/3;
	    	return	result += result.valueOf(thisIsInt);
	    	
	    	}
	    	else if(number instanceof Byte) {
	    		//thisIsInt = (int)number;
	    		return (Byte) number / 2 + "b";
	    	}
	    	else {
	    		return UNEXPECTED_TYPE;
	    	}
	    }

}
