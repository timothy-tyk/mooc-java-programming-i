
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timo
 */
public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int max){
        this.items = new ArrayList<>();
        this.maxWeight = max;
    }
    
    public void addItem(Item item){
        int totalWeight = 0;
        for(Item i:this.items){
            totalWeight+=i.getWeight();
        }
        if(totalWeight+item.getWeight()<=this.maxWeight){
            this.items.add(item);
        }
    }
    
    public String toString(){
        if(this.items.isEmpty())return "no items (0 kg)";
        
        int totalWeight = 0;
        for(Item i:this.items){
            totalWeight+=i.getWeight();
        }
        if(this.items.size()==1){
            return String.format("%s item (%s kg)",1,totalWeight);
        }
        return String.format("%s items (%s kg)",this.items.size(),totalWeight);
    }
    
    public void printItems(){
        System.out.println("The suitcase contains the following items:");
        for(Item i:this.items){
            System.out.println(String.format("%s (%s kg)",i.getName(),i.getWeight()));
        }
    }
    
    public int totalWeight(){
        int total = 0;
        for (Item i:this.items){
            total+=i.getWeight();
        }
        return total;
    }
    
    public Item heaviestItem(){
        if(this.items.isEmpty()) return null;
        Item heaviest = this.items.get(0);
        for(int i=0;i<this.items.size();i++){
            if(this.items.get(i).getWeight()>heaviest.getWeight()){
                heaviest = this.items.get(i);
            }
        }
        return heaviest;
    }
}
