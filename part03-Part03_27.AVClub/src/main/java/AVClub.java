
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        while(true){
            String nextLine = scanner.nextLine();
            if(nextLine.equals("")){
                break;
            }
            sentence+=" "+nextLine;
        }
        String[] words = sentence.split(" ");
        for(String word:words){
            if(word.contains("av")){
                System.out.println(word);
            }
        }
    }
}
