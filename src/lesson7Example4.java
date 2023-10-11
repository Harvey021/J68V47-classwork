import java.util.*;
public class lesson7Example4 {
    public static void printMessage(String message, int x){
        for (int i=0; i<x;i++){  // repeat x number of times
            System.out.println(message); // display contents of message
        }
    }
    public static void main(String[] args) {
        printMessage("Hello world", 5); // call the printMessage subroutine
        // and pass “Hello world” as a parameter
    }

}
