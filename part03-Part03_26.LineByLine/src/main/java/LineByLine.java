
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String toSplit = scanner.nextLine();
        while(true){
            String words = scanner.nextLine();
            if(words.equals("")){
            break;
            }
            toSplit+=" "+words;
        }
        
        String[] split = toSplit.split(" ");
        for(String word:split){
            System.out.println(word);
        }

    }
}
