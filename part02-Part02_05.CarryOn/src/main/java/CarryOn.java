
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = "";
        while(!command.equals("no")){
            System.out.println("Shall we carry on?");
            command = scanner.nextLine();
        }
        
    }
}
