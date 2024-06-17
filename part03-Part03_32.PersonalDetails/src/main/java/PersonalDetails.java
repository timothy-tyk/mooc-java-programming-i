
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0;
        int totalAge=0;
        String longestName="";
        int longestLength=0;
        while(true){
            String input = scanner.nextLine();            
            if(input.equals("")){
                break;
            }
            count++;
             String[] split = input.split(",");
             totalAge+=Integer.valueOf(split[1]);
             if(longestLength<split[0].length()){
                 longestLength=split[0].length();
                 longestName = split[0];
             }
        }
        System.out.println("Longest name: "+longestName);
        System.out.println("Average of the birth years: "+(double)totalAge/count);

    }
}
