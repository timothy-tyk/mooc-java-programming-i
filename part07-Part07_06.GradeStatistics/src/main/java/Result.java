
import java.util.ArrayList;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timo
 */
public class Result {
    private ArrayList<Integer> points;
    
    public Result(){
        this.points = new ArrayList<>();
    }
    public void addResult(int point){
        this.points.add(point);
    }
    public int sumAll(){
        int total=0;
        for(int p:points){
            total+=p;
        }
        return total;
    }
    public double averageAll(){
        int total = sumAll();
        return (double)total/points.size();
    }
    public double passingAverage(){
        int total=0;
        int count=0;
        for(int p:points){
            if(p>=50){
                total+=p;
                count++;
            }
        }
        if(count==0)return 0;
        return (double)total/count;
    }
    public double passPercentage(){
        int count=0;
        for(int p:points){
            if(p>=50){
                count++;
            }
        }
        return ((double)count/this.points.size())*100;
    }
    
    public void gradeDistribution(){
        String[] stars = new String[6];
        Arrays.fill(stars, "");
        for(int p : points){
            if(p<50){
                stars[0]+="*";
            }else if(p<60){
                stars[1]+="*";
            }else if(p<70){
                stars[2]+="*";
            }else if(p<80){
                stars[3]+="*";
            }else if(p<90){
                stars[4]+="*";
            }else{
                stars[5]+="*";
            }
        }
        System.out.println("Grade distribution:");
        for(int i=stars.length-1;i>=0;i--){
            System.out.println(String.format("%s: %s",i,stars[i]));
        }
    }
    
}
