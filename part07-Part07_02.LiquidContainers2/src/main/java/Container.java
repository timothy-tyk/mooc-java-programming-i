/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timo
 */
public class Container {
    private int currentAmount;
    private int min;
    private int max;
    
    public Container(){
        this.currentAmount=0;
        this.min=0;
        this.max=100;
    }
    
    public int contains(){
        return this.currentAmount;
    }
    public void add(int amount){
        if(amount>0){
            if(amount+this.currentAmount>this.max){
                this.currentAmount = this.max;
            }else{
                this.currentAmount+=amount;
            }
        }
    }
    public void remove(int amount){
        if(amount>0){
            if(this.currentAmount-amount<this.min){
                this.currentAmount = this.min;
            }else{
                this.currentAmount-=amount;
            }
        }
    }
    public String toString(){
        return String.format("%s/%s",this.currentAmount,this.max);
    }
}
