
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Give a year: ");
        int year = Integer.valueOf(scan.nextInt());
        boolean leapYear=false;
        if(year%100==0){
            if(year%400==0){
                leapYear = true;
            }else{
                leapYear = false;
            }
        }else if(year % 4==0){
            leapYear = true;
        }
        if(leapYear){
            System.out.println("The year is a leap year.");
        }else{
            System.out.println("The year is not a leap year.");
        }
    }
}
