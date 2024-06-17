
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
public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;
    
    public UserInterface(JokeManager jm, Scanner sc){
        this.jokeManager = jm;
        this.scanner = sc;
    }
    
    public void start(){
        System.out.println("Commands:");
        System.out.println("1 - add a joke");
        System.out.println("2 - draw a joke");
        System.out.println("3 - list jokes");
        System.out.println("X - stop");
        
        while(true){
            String command = this.scanner.nextLine();
            if(command.equals("1")){
                add();
            }else if(command.equals("2")){
                draw();
            }else if(command.equals("3")){
                list();
            }else if(command.equals("X")){
                break;
            }
        }
    }
    
    public void add(){
        System.out.println("Write the joke to be added: ");
        String joke = this.scanner.nextLine();
        this.jokeManager.addJoke(joke);
    }
    public void draw(){
        String joke = this.jokeManager.drawJoke();
        System.out.println(joke);
    }
    public void list(){
        this.jokeManager.printJokes();
    }
}
