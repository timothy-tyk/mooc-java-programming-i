
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
public class BirdRepository {
    private ArrayList<Bird> birds;
    
    public BirdRepository(){
        this.birds = new ArrayList<>();
    }
    
    public void addBird(Bird b){
        birds.add(b);
    }
    
    public void listAllBirds(){
        for(Bird b:birds){
            System.out.println(b);
        }
    }
    
    public void getBird(String name){
        for(Bird b: birds){
            if(b.getName().equals(name)){
                System.out.println(b);
            }
        }
    }
    public void addObservation(String name){
        for(Bird b: birds){
            if(b.getName().equals(name)){
                b.addObservation();
                return;
            }
        }
        System.out.println("Not a bird!");
    }
    
}
