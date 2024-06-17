
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String fileName = scan.nextLine();
        ArrayList<Statistic> stats = readFromFile(fileName);
        System.out.println("Team: ");
        String teamName = scan.nextLine();
        int gameCount=0;
        int winCount=0;
        for(Statistic stat:stats){
            if(stat.getHomeTeam().equals(teamName)||stat.getVisitingTeam().equals(teamName)){
               gameCount++;
            }
            if(stat.getHomeTeam().equals(teamName) && stat.getHomeTeamPoints()>stat.getVisitingTeamPoints()){
                winCount++;
            }
            if(stat.getVisitingTeam().equals(teamName) && stat.getVisitingTeamPoints()>stat.getHomeTeamPoints()){
                winCount++;
            }
        }
        System.out.println("Games: "+ gameCount);
        System.out.println("Wins: "+winCount);
        System.out.println("Losses: "+(gameCount-winCount));
    }
    public static ArrayList<Statistic> readFromFile(String fileName){
        ArrayList<Statistic> statistics = new ArrayList<>();
        try{
            Scanner fileScanner = new Scanner(Paths.get(fileName));
            while(fileScanner.hasNextLine()){
                String[] data = fileScanner.nextLine().split(",");
                statistics.add(new Statistic(data[0],data[1],Integer.valueOf(data[2]),Integer.valueOf(data[3])));
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return statistics;
    }

}
