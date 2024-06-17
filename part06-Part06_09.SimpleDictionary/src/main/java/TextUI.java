
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timo
 */
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dict){
        this.scanner = scanner;
        this.dictionary = dict;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            if(command.equals("end")){
                end();
                break;
            }else if(command.equals("add")){
                add();
            }else if(command.equals("search")){
                search();
            }else{
                System.out.println("Unknown command");
            }
        }
    }
    public void end(){
        System.out.println("Bye bye!");
    }
    public void add(){
        System.out.print("Word: ");
        String word = this.scanner.nextLine(); 
        System.out.print("Translation: ");
        String translation = this.scanner.nextLine();
        this.dictionary.add(word, translation);
    }
    
    public void search(){
        System.out.print("To be translated: ");
        String toBeTranslated = this.scanner.nextLine();
        String translated = translate(toBeTranslated);
        if(translated==null){
            System.out.println("Word "+toBeTranslated+" was not found");
        }else{
            System.out.println("Translation: "+translated);
        }
    }
    public String translate(String toBeTranslated){
        return this.dictionary.translate(toBeTranslated);
    }
}
