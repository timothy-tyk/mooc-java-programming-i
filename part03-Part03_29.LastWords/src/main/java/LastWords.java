
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String nextLine = scanner.nextLine();
            if(nextLine.equals("")){
                break;
            }
            String[] words = nextLine.split(" ");
            System.out.println(words[words.length-1]);
        }
        

    }
}
