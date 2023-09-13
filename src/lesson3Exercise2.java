import java.util.*;
public class lesson3Exercise2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the capital of france? ");
        String question1 = input.nextLine();
        System.out.println(question1.contains("paris"));

        System.out.print("What is the capital of spain? ");
        String question2 = input.nextLine();
        System.out.println(question2.contains("madrid"));

        System.out.print("What is the capital of the UK? ");
        String question3 = input.nextLine();
        System.out.println(question3.contains("london"));
    }
}
