
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String inputFile = scanner.nextLine();
        
        RecipeBook rb = new RecipeBook();
        try{
            Scanner fileScanner = new Scanner(Paths.get(inputFile));
            Recipe newRec = createRecipe(fileScanner);
            while(fileScanner.hasNextLine()){
                String ing = fileScanner.nextLine();
                if(!ing.isEmpty()){
                    newRec.addIngredient(ing);
                }
                else{
                    rb.addRecipe(newRec);
                    newRec = createRecipe(fileScanner);
                }
            }
            rb.addRecipe(newRec);
        }
            catch(IOException e){
                    System.out.println(e);
                }
        
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
        while(true){
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            if(command.equals("stop")){
                break;
            }else if(command.equals("list")) rb.listRecipes();
            else if(command.equals("find name")){
                System.out.print("Searched word: ");
                String name = scanner.nextLine();
                rb.searchRecipeName(name);
            }else if(command.equals("find cooking time")){
                System.out.print("Max cooking time: ");
                int timing = Integer.valueOf(scanner.nextLine());
                rb.searchRecipeTime(timing);
            }else if(command.equals("find ingredient")){
                System.out.print("Ingredient: ");
                String ing = scanner.nextLine();
                rb.searchByIngredient(ing);
            }
        }
        
    }
    public static Recipe createRecipe(Scanner fs){
        String name = fs.nextLine();
        int time = Integer.valueOf(fs.nextLine());
        return new Recipe(name, time);
    }
    

}
