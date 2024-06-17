
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000.00;
        this.affordableMeals=0;
        this.heartyMeals=0;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double affordableMealPrice = 2.50;
        if(payment>=affordableMealPrice){
            this.affordableMeals++;
            this.money+=affordableMealPrice;
            return payment-affordableMealPrice;
        }else{
            return payment;
        }
    }
    
    public boolean eatAffordably(PaymentCard card){
        double affordableMealPrice=2.50;
        if(card.balance()>=affordableMealPrice){
            card.takeMoney(affordableMealPrice);
            this.affordableMeals++;
            return true;
        }else{
            return false;
        }
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double heartyMealPrice = 4.30;
        if(payment>=heartyMealPrice){
            this.heartyMeals++;
            this.money+=heartyMealPrice;
            return payment-heartyMealPrice;
        }else{
        return payment;
        }
    }
    
    public boolean eatHeartily(PaymentCard card){
        double heartyMealPrice = 4.30;
        if(card.balance()>=heartyMealPrice){
            card.takeMoney(heartyMealPrice);
            this.heartyMeals++;
            return true;
        }else{
            return false;
        }
    }
    
    public void addMoneyToCard(PaymentCard card, double sum){
        if(sum>=0){
            card.addMoney(sum);
            this.money+=sum;   
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
