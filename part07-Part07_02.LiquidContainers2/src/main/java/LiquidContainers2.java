
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println(String.format("First: %s",first));
            System.out.println(String.format("Second: %s",second));
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String command[] = input.split(" ");
            if(command[0].equals("add")){
                int amount = Integer.valueOf(command[1]);
                first.add(amount);
            }else if(command[0].equals("remove")){
                int amount = Integer.valueOf(command[1]);
                second.remove(amount);
            }else if(command[0].equals("move")){
                int amount = Integer.valueOf(command[1]);
                if(first.contains()>=amount){
                    first.remove(amount);
                    second.add(amount);
                }else{
                    second.add(first.contains());
                    first.remove(first.contains());
                }
                
            }

        }
    }

}
