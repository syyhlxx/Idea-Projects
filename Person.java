package reviewMaterials;
/*
 * Methods in Java
 * 
 * public static void name(Type1 name1, Type2 name2, Type3 name3)
	{
  	method body
	}
 * 
 */

public class Person {
	
	  public int age = 20;

      public void adjustAge(int age) {
          //this.age = age + 20;
          this.age = -11 % 2;
          System.out.println("The age in adjustAge() is: " + this.age);
      }
	
	public static void main(String[] args) {
		
		Person person = new Person();
	    System.out.println("Age: " + person.age);
	    person.adjustAge(person.age);
	    System.out.println("Adjusted age: " + person.age);
	}


}
