/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timo
 */
public class Timer {
    private ClockHand hundredthSecondHand;
    private ClockHand secondHand;
    
    public Timer(){
        this.hundredthSecondHand = new ClockHand(100);
        this.secondHand = new ClockHand(60);
    }
    
    public String toString(){
        return this.secondHand+":"+this.hundredthSecondHand; 
    }
    
    public void advance(){
        this.hundredthSecondHand.advance();
        if(this.hundredthSecondHand.value()==0){
            this.secondHand.advance();
        }
    }
}
