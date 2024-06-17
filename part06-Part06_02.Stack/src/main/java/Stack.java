
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
public class Stack {
    private ArrayList<String> values;
    
    public Stack(){
        this.values = new ArrayList<String>();
    }
    
    public boolean isEmpty(){
        return this.values.isEmpty();
    }
    
    public void add(String value){
        values.add(value);
    }
    
    public ArrayList<String> values(){
        return this.values;
    }
    
    public String take(){
        String toTake = this.values().get(this.values.size()-1);
        this.values().remove(this.values.size()-1);
        return toTake;
    }
}
