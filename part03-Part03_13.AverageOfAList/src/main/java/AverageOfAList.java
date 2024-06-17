
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        while(true){
            int number = Integer.valueOf(scanner.next());
            if(number==-1){
                break;
            }
            list.add(number);
        }
        int sum = 0;
        for(Integer num : list){
            sum+=num;
        }
        System.out.println("Average: "+(double)sum/list.size());
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        
    }
}
