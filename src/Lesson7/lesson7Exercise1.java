package Lesson7;

import java.util.*;
public class lesson7Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Say \"hello\"");
        System.out.println("2. Tell me the time");
        System.out.println("3. Tell me a joke");
        System.out.println("4. Quit");
//----------------------------------------------------------------------------


        int Choice;
        do {
            System.out.print("Enter an option (1-4): ");
            Choice = scanner.nextInt();
            System.out.println("Option selected: " + Choice);
            if (Choice == 1) {
                System.out.println("Hello");
            } else if (Choice == 2) {
                System.out.println("Option 2");
            } else {
                System.out.println("Option 3");
            }

        } while (Choice != 4);
    }
}
