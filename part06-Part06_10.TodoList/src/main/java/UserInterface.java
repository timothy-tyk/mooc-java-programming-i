
import java.util.ArrayList;
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
    private TodoList todo;
    private Scanner scanner;
    
    public UserInterface(TodoList todo, Scanner scanner){
        this.todo = todo;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            if(command.equals("stop")){
                break;
            }else if(command.equals("add")){
                add();
            }else if(command.equals("list")){
                list();
            }else if(command.equals("remove")){
                remove();
            }
        }
    }
    public void add(){
        System.out.print("To add: ");
        String toAdd = this.scanner.nextLine();
        this.todo.add(toAdd);
    }
    public void list(){
        ArrayList<String> tasks = this.todo.getTasks();
        for(int i=0;i<tasks.size();i++){
            System.out.println(String.format("%s: %s",i+1,tasks.get(i)));
        }       
    }
    public void remove(){
        System.out.print("Which one is removed? ");
        int i = Integer.valueOf(this.scanner.nextLine());
        ArrayList<String> tasks = this.todo.getTasks();
        tasks.remove(i-1);
    }
}
