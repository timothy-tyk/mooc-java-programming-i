
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
public class RecipeBook {
    private ArrayList<Recipe> recipes;
    
    public RecipeBook(){
        this.recipes = new ArrayList<>();
    }
    
    public void addRecipe(Recipe rec){
        this.recipes.add(rec);
    }
    
    public void listRecipes(){
        System.out.println("Recipes: ");
        for(Recipe r:this.recipes){
            System.out.println(r.getName()+", cooking time: "+r.getTime());
        }
    }
    
    public void searchRecipeName(String query){
        System.out.println("Recipes: ");
        for(Recipe r: this.recipes){
            if(r.getName().contains(query)){
                System.out.println(r.getName()+", cooking time: "+r.getTime());
            }
        }
    }
    
    public void searchRecipeTime(int time){
        System.out.println("Recipes: ");
        for(Recipe r: this.recipes){
            if(r.getTime()<=time){
                System.out.println(r.getName()+", cooking time: "+r.getTime());
            }
        }
    }
    
    public void searchByIngredient(String ing){
        System.out.println("Recipes: ");
        for(Recipe r: this.recipes){
           if(r.containsIngredient(ing)){
               System.out.println(r.getName()+", cooking time: "+r.getTime());
           }
        }
    }
}
