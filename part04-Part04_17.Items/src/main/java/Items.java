
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            String itemName = scanner.nextLine();
            if(itemName.isEmpty()){
                break;
            }
            Item item = new Item(itemName);
            items.add(item);
        }
        for(Item i:items){
            System.out.println(i.toString());
        }

    }
}
