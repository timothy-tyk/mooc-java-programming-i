/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timo
 */
public class Item {
    private String identifier;
    private String name;
    
    public Item(String id, String name){
        this.identifier=id;
        this.name=name;
    }
    public String getIdentifier(){
        return this.identifier;
    }
    public String getName(){
        return this.name;
    }
    public boolean equals(Object o){
        if(o==this)return true;
        if(!(o instanceof Item))return false;
        Item it = (Item)o;
        if(it.identifier.equals(this.identifier)){
            return true;
        }
        return false;
    }
}
