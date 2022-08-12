package reviewMaterials;

public class Cat {
	
	 private String name = "nameless cat";  
	 private String fullName;
	 
	 private static int catCount = 0;
	 public static int count = 0;
	
	 
	 public void setName(String name) {
	        //write your code here
	    	this.name = name;
	    }

	    public void setName(String firstName, String lastName) {
	        String fullName = firstName + " " + lastName;
	        this.fullName = fullName;//write your code here
	    }

	 
	 public static void setCatCount(int catCount) {
	        //write your code here
		 Cat.catCount = catCount;

	    }

	    public static void addNewCat() {
	        //write your code here
	    	catCount++;
	    }	

	    public static void main(String[] args) {
	        
	    	 Cat cat1 = new Cat();
	         //write your code here
	    	 Cat.count++;

	         Cat cat2 = new Cat();
	         //write your code here
	         Cat.count++;
	         
	         Cat cat = new Cat();
	        //cat.addNewCat();
	        cat.setCatCount(1001);
	        cat.setName("Charlie","Catlan");
	        System.out.println(cat.fullName);
	       // System.out.println(cat.catCount);
	        System.out.println("The cat count is " + Cat.count);
	    }
}
