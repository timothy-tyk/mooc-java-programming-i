
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
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int max){
        this.maxWeight = max;
        this.suitcases = new ArrayList<Suitcase>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        int total=0;
        for(Suitcase s:this.suitcases){
            total+=s.totalWeight();
        }
        if(total+suitcase.totalWeight()<=this.maxWeight){
            this.suitcases.add(suitcase);
        }
    }
    
    public String toString(){
        int total=0;
        for(Suitcase s:this.suitcases){
            total+=s.totalWeight();
        }
        return String.format("%s suitcases (%s kg)", suitcases.size(), total);
    }
    public void printItems(){
        for(Suitcase s:this.suitcases){
            s.printItems();
        }
    }
}
