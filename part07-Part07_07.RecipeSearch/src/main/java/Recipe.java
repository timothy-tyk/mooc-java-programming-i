
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
public class Recipe {
    private String name;
    private int time;
    private ArrayList<String> ingredients;
    public Recipe(){}
    
    public Recipe(String name, int time){
        this.name = name;
        this.time = time;
        this.ingredients = new ArrayList<>();
    }
    
    public void addIngredient(String ingredient){
        this.ingredients.add(ingredient);
    }
    public String getName(){
        return this.name;
    }
    public int getTime(){
        return this.time;
    }
    public boolean containsIngredient(String ing){
        for(String i:this.ingredients){
            if(i.equals(ing))return true;
        }
        return false;
    }
}
