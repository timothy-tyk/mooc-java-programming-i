
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Which file should have its contents printed?");
            String fileName = scanner.nextLine();
            Scanner fileScanner = new Scanner(Paths.get(fileName));
            while(fileScanner.hasNextLine()){
                System.out.println(fileScanner.nextLine());
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
