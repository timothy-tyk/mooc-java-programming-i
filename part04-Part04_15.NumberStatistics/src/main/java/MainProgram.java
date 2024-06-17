
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics evenNos = new Statistics();
        Statistics oddNos = new Statistics();
        System.out.println("Enter numbers: ");
        
        while(true){
            int toAdd = Integer.valueOf(scanner.nextLine());
            if(toAdd == -1){
                break;
            }
            statistics.addNumber(toAdd);
            if(toAdd%2==0){
                evenNos.addNumber(toAdd);
            }else{
                oddNos.addNumber(toAdd);
            }
        }
        System.out.println("Sum: "+statistics.sum());
        System.out.println("Sum of even numbers: "+evenNos.sum());
        System.out.println("Sum of odd numbers: "+oddNos.sum());
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
    }
}
