import java.util.*;
public class lesson7Example3 {
    public static String getMessage(){
        Scanner input = new Scanner(System.in);
        return input.nextLine(); // ask the user to enter a string and return it to
    }						      // the calling code
    public static void main(String[] args) {
        String message = getMessage();  // call the getMessage subroutine
        lesson7Example2.printMessage(message); // display contents of the message variable returned
    }

}
