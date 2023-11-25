/*******************
  Nathaniel Bucknor-Smartt
  9/5/2023
  Module 2.3
  This program calculates how much money you have 
  in the register
**********************/
import java.util.Scanner;
public class MoneyCounter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final int D100 = 100;
        final int D50 = 50;
        final int D20 = 20;
        final int D10 = 10;
        final int D5 = 5;
        final int D1 = 1;
        final double C25 =0.25;
        final double C10 =0.10;
        final double C5 =0.05;
        final double C1 =0.02;

        int d100,d50,d20,d10,d5,d1;
        double c25,c10,c5,c1,total;

        System.out.println("How many 100 Dollar Bills are in the register?: ");
        d100 = scan.nextInt()*D100;
        System.out.println("How many 50 Dollar Bills are in the register?: ");
        d50 = scan.nextInt()*D50;
        System.out.println("How many 20 Dollar Bills are in the register?: ");
        d20 = scan.nextInt()*D20;
        System.out.println("How many 10 Dollar Bills are in the register?: ");
        d10 = scan.nextInt()*D10;
        System.out.println("How many 5 Dollar Bills are in the register?: ");
        d5 = scan.nextInt()*D5;
        System.out.println("How many 1 Dollar Bills are in the register?: ");
        d1 = scan.nextInt();
        System.out.println("How many Quarters are in the register?: ");
        c25 = scan.nextInt()*C25;
        System.out.println("How many Dimes are in the register?: ");
        c10 = scan.nextInt()*C10;
        System.out.println("How many Nickels are in the register?: ");
        c5 = scan.nextInt()*C5;
        System.out.println("How many Pennies are in the register?: ");
        c1 = scan.nextInt()*C1;

        total = d100+d50+d20+d10+d5+d1+c25+c10+c5+c1;
        System.out.println("You have $"+total+" in the register!");
    }
}
