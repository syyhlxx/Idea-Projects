
import java.util.*;
public class DeleteSpaces {

    public static void main(String[] args) {
        String stringWithoutSpaces = deleteSpaces("Good afternoon! How's life?");
        System.out.println(stringWithoutSpaces);
    }

    public static String deleteSpaces(String string) {
        String result = "";
        StringTokenizer st = new StringTokenizer(string," ");
        while (st.hasMoreTokens()) {
            //System.out.println(result+=st.nextToken());
            result+=st.nextToken();
        }
        //write your code here
        return result;
    }
}
