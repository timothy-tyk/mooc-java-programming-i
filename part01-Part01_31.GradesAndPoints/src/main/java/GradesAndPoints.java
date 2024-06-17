
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]");
        int gradeInt = Integer.valueOf(scan.nextLine());
        String grade = "";
        if(gradeInt<0){
            grade = "impossible!";
        }else if(gradeInt<=49){
            grade = "failed";
        }else if(gradeInt<=59){
            grade = "1";
        }else if(gradeInt<=69){
            grade = "2";
        }else if(gradeInt<=79){
            grade = "3";
        }else if(gradeInt<=89){
            grade = "4";
        }else if(gradeInt<=100){
            grade = "5";
        }else{
            grade = "incredible!";
        }
        System.out.println("Grade: "+grade);
    }
}
