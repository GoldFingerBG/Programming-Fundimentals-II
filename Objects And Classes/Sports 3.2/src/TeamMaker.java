/*******************
  Nathaniel Bucknor-Smartt
  09/19/2023
  Module 3.2
  This program takes in data about a sports team
  and displays it to the user. As well as calculating the win/loss
**********************/
import java.util.*;
import java.text.DecimalFormat;
public class TeamMaker {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        String name;  
            
        int numberOfPlayers, seasonWins, seasonLosses;

        System.out.println("What is the teams name?: ");
        name = scan.nextLine();
        System.out.println("How many players do they have?: ");
        numberOfPlayers = scan.nextInt();
        System.out.println("How many seasons have they won?:");
        seasonWins = scan.nextInt();
        System.out.println("How many seasons have they lost?: ");
        seasonLosses = scan.nextInt();
        scan.close();

        Sports team = new Sports(name, numberOfPlayers, seasonWins, seasonLosses);
        System.out.println("The team name is the " + team.getName());
        System.out.println("The team has " + team.getNumberOfPlayers() + " players");
        System.out.println("The team has won " + team.getSeasonWins() + " times.");
        System.out.println("The team lost " + team.getSeasonLosses() + " times");
        System.out.println("The teams win/loss is " + df.format(team.winLoss(team.getSeasonWins(), team.getSeasonLosses())));

    }
}
