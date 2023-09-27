import java.util.*;
public class lesson5Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the base number: ");
        int baseNumber = input.nextInt();

        int count = input.nextInt();
        for(count = 1; count<=12; count+=1);{
            System.out.println(baseNumber + "x" + count);
        }
    }
}
