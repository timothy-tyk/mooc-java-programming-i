
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstAmount = 0;
        int secondAmount = 0;

        while (true) {
            System.out.println(String.format("First: %s/100", firstAmount));
            System.out.println(String.format("Second: %s/100", secondAmount));
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] command = input.split(" ");
            if(command[0].equals("add")){
                int amount = Integer.valueOf(command[1]);
                if(amount<0) continue;
                int total = firstAmount+amount;
                if(total<=100){
                    firstAmount=total;
                }else{
                    firstAmount= 100;
                }
            }
            else if(command[0].equals("move")){
                int amount = Integer.valueOf(command[1]);
                if(amount<0)continue;
                if(firstAmount - amount <0){
//                    secondAmount=add(secondAmount, firstAmount);
                    int total = secondAmount+firstAmount;
                    if(total<=100){
                        secondAmount=total;
                    }else{
                        secondAmount=100;
                    }
                        firstAmount=0;
                }else{
                    firstAmount-=amount;
//                    secondAmount=add(secondAmount, amount);
                    int total = secondAmount+amount;
                    if(total<=100){
                        secondAmount=total;
                    }else{
                        secondAmount=100;
                    }
                        
                }
            }else if(command[0].equals("remove")){
                int amount = Integer.valueOf(command[1]);
//                secondAmount = remove(secondAmount, amount);
                if(amount<0)continue;
                int min = 0;
                int total = secondAmount-amount;
                if(total>=min){
                    secondAmount= total;
                }else{
                    secondAmount = min;
                }
            }
        }
    }
    
    
//    public static int remove(int start, int amount){
//        if(amount<0)return start;
//        int min = 0;
//        int total = start-amount;
//        if(total>=min){
//            return total;
//        }else{
//            return min;
//        }
//    }
   

}
