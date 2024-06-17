
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of file:");
        String fileName = scanner.nextLine();
        try{
            Scanner fileScanner = new Scanner(Paths.get(fileName));
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                if(line.isEmpty()){
                    continue;
                }
                String[] lineData = line.split(",");
                if(Integer.valueOf(lineData[1])<=1){
                    System.out.println(lineData[0]+", age:"+lineData[1]+" year");
                }else{
                    System.out.println(lineData[0]+", age:"+lineData[1]+" years");
                }
                
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
