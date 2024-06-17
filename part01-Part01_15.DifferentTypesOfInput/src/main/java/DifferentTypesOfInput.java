
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String message = scan.nextLine();
        System.out.println("Give an integer:");
        int valueInt = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double valueDouble = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean bool = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string "+message);
        System.out.println("You gave the integer "+valueInt);
        System.out.println("You gave the double "+valueDouble);
        System.out.println("You gave the boolean "+bool);
    }
}
