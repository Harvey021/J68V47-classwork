import java.util.*;
public class lesson4Exercise1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is your first name? ");
        String firstName = input.nextLine();

        System.out.print("What is your surname? ");
        String surName = input.nextLine();

        System.out.print("Enter your order total: £");
        float orderTotal = input.nextFloat();

        System.out.print("Enter the amount you wish to pay as a deposit: £");
        float deposit = input.nextFloat();

        System.out.println("== RECEIPT ==");

        System.out.println("Customer: " + firstName.substring(0,1).toUpperCase() + " " + surName);

        System.out.println("Order Total: " + orderTotal);

        System.out.println("Deposit Paid: " + deposit);

        System.out.println("Remainder: " + (orderTotal - deposit));

        if (deposit > 100) {
            System.out.println("You get a free toaster!");
        }
        System.out.println("Have a nice day");

    }
}
