/*******************
  Nathaniel Bucknor-Smartt
  9/5/2023
  Module 2.1
  This program displays a random number 
  between the low and high bounds
**********************/
import java.util.Scanner;

public class FirstDayOfClass {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int low = 0;
        int high = 0;
        String name = "";
        
        //Getting the bounds for the random number
        System.out.println("Whats your username?");
        name = scan.nextLine();
        System.out.println("Give me the Low end");
        low = scan.nextInt();
        System.out.println("Give me the High end");
        high = scan.nextInt();
        scan.close();

        //Making the random number
        int rand = low + (int)(Math.random()*((high-low)+1));
        System.out.println("Name: " + name);

        System.out.println();
        System.out.println("The number is " + rand);

    }
}
