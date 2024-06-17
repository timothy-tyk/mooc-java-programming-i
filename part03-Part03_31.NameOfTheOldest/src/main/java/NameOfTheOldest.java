
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max=0;
        String name="";
        while(true){
            String input = scanner.nextLine();            
            if(input.equals("")){
                break;
            }
             String[] split = input.split(",");
             if(Integer.valueOf(split[1])>max){
                 max=Integer.valueOf(split[1]);
                 name=split[0];
             }
        }
        System.out.println("Name of the oldest: "+name);

    }
}
