
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInt = Integer.valueOf(scanner.nextLine());
        int secondInt = Integer.valueOf(scanner.nextLine());
        if(firstInt == secondInt){
            System.out.println(firstInt+" is equal to "+secondInt+".");
        }else if(firstInt>secondInt){
            System.out.println(firstInt +" is greater than "+secondInt+".");
        }else{
            System.out.println(firstInt+" is smaller than "+secondInt+".");
        }
    }
}
