
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] username = {"alex","emma"};
        String[] password = {"sunshine","haskell"};
        System.out.print("Enter username: ");
        String user = scanner.nextLine();
        System.out.print("Enter password: ");
        String pass = scanner.nextLine();
        for(int i=0;i<username.length;i++){
            if(username[i].equals(user) && password[i].equals(pass)){
                System.out.println("You have successfully logged in!");
                return;
            }
        }
        System.out.println("Incorrect username or password!");
    }
}
