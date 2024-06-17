
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdRepository br = new BirdRepository();
        while(true){
            System.out.print("? ");
            String command = scan.nextLine();
            if(command.equals("Quit")){
                break;
            }else if(command.equals("Add")){
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.println("Name in Latin: ");
                String latinName = scan.nextLine();
                
                Bird b = new Bird(name, latinName);
                br.addBird(b);
            }else if(command.equals("One")){
                System.out.print("Bird? ");
                String birdName = scan.nextLine();
                br.getBird(birdName);
            }else if(command.equals("All")){
                br.listAllBirds();
            }else if(command.equals("Observation")){
                System.out.print("Bird? ");
                String birdName = scan.nextLine();
                br.addObservation(birdName);
            }
        }
    }
    
    

}
