
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items= new ArrayList<>();
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String input = scanner.nextLine();
            if(input.isEmpty())break;
            String id = input;
            System.out.println("Name? (empty will stop)");
            input = scanner.nextLine();
            if(input.isEmpty())break;
            String name = input;
            Item toAdd = new Item(id, name);
            if(items.contains(toAdd)){
                continue;
            }else{
                items.add(toAdd);
            }
            
        }
        System.out.println("==Items==");
        for(Item i:items){
            System.out.println(String.format("%s: %s",i.getIdentifier(),i.getName()));
        }

    }
}
