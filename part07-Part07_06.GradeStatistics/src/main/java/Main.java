
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        Result res = new Result();
        System.out.println("Enter point totals, -1 stops:");
        while(true){
            String input = scanner.nextLine();
            if(input.equals("-1"))break;
            int point = Integer.valueOf(input);
            if(point>=0 && point <=100){
                res.addResult(point);
            }
        }
        System.out.println("Point average (all): "+res.averageAll());
        System.out.println(String.format("Point average (passing): %s",res.passingAverage()==0?"-":res.passingAverage()));
        System.out.println("Pass percentage: "+res.passPercentage());
        res.gradeDistribution();
    }
}
