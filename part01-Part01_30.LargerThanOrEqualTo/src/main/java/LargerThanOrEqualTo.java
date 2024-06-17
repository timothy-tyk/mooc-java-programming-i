
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int firstInt = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int secondInt = Integer.valueOf(scan.nextLine());
        if(firstInt>secondInt){
            System.out.println("Greater number is: "+firstInt);
        }else if(firstInt<secondInt){
            System.out.println("Greater number is: "+secondInt);
        }else{
            System.out.println("The numbers are equal!");
        }
    }
}
