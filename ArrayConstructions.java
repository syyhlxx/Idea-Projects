package reviewMaterials;

public class ArrayConstructions {
	
	
}
/*Variables inside a for loop

"And one more small but interesting fact. There's also a place where a variable
is declared in a special way — I'm talking about inside a for loop." Typically, 
a for loop has a counter variable in parentheses. And what will be the visibility 
of this variable? After all, it's not in the body of the loop. Is it the whole method? Or not?"

"I've already heard something about this. As I understand it, a variable declared 
in the header of a for loop is visible only in the body of the loop and in the header
 of the for loop."*/


/*Find the smallest element in the array
 *  public static void main(String[] args) throws IOException
    {
        int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

        int min = list[0];
        for (int i = 1; i < list.length; i++)
        {
             if (list[i] < min)
                  min = list[i];
        }

       System.out.println ("Min is " + min);
    }
 */

/* Add up array elements
public static void main(String[] args) throws IOException
{
    // Static initialization
    int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

    // Calculate the sum
    int sum = 0;
    for (int i = 0; i < list.length; i++)
       sum += list[i];

    System.out.println("Sum is " + sum);
}*/


/*public static void main(String[] args) throws IOException
{
    int[] list = new int[10];

    // Fill the array
    for (int i = 0; i < list.length; i++)
       list[i] = i;

    // Display the contents of the array
    for (int i = 0; i < list.length; i++)
      System.out.println(list[i]);
}*/

/*public static void main(String[] args) throws IOException
{
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  int[] list = new int[10];

  for (int i = 0; i < list.length; i++)
  {
    String s = reader.readLine();
    list[i] = Integer.parseInt(s);
  }
}*/

/*public static void main(String[] args) throws IOException
{
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  String[] list = new String[10];

  for (int i = 0; i < list.length; i++)
  {
    list[i] = reader.readLine();
   }
}*/

/*public static void main(String[] args)
{
    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++)
    {
       numbers[i] = 9 - i;
    }
}*/

/*public static void main(String[] args)
{
    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++)
    {
       numbers[i] = i;
    }
}*/
	

/* public static void main(String[] args)
	    {
	        int[] numbers = new int[10];

	        for (int i = 0; i < numbers.length; i++)
	        {
	           numbers[i] = i + 1;
	        }
	    }*/


/*public static void main(String[] args)
{
    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++)
    {
       numbers[i] = 10 - i;
    }
}*/