import java.util.*;
public class lesson2Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();

        System.out.print("What is your favourite hobby? ");
        String hobby = input.nextLine();
        System.out.println(name + " likes to do " + hobby + " in their free time.");

        System.out.println("They find it fun and relaxing to do "+hobby);
        System.out.println(hobby+" allows "+name+" to escape stress.");
    }
}
