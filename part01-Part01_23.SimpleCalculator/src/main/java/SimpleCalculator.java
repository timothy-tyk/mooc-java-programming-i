
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstInt = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondInt = Integer.valueOf(scanner.nextLine());
        System.out.println(firstInt+" + "+secondInt+" = "+(firstInt+secondInt));
        System.out.println(firstInt+" - "+secondInt+" = "+(firstInt-secondInt));
        System.out.println(firstInt+" * "+secondInt+" = "+(firstInt*secondInt));
        System.out.println(firstInt+" / "+secondInt+" = "+((double)firstInt/secondInt));
    }
}
