import java.util.*;
public class lesson3Exercise1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is your first name? ");
        String firstName = input.nextLine();

        System.out.print("What is your surname? ");
        String surName = input.nextLine();

        System.out.print("What is your year of birth? ");
        String YearOfBirth = input.nextLine();

        String Username = (firstName.substring(0,1) + surName.toLowerCase());
        System.out.println("username: "+Username);

        String Password = (surName.substring(0,1).toLowerCase() + firstName.substring(0,3).toUpperCase() + YearOfBirth);
        System.out.println("password: "+Password);
    }
}
