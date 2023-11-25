/*******************
  Nathaniel Bucknor-Smartt
  9/5/2023
  Module 2.2
  This program calculates the area of a given triange
**********************/
import java.util.Scanner;
import java.text.DecimalFormat;

public class AreaOfATriangle {
    public static void main(String[] args){

        final DecimalFormat df = new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);
        String name = "";
        double a, b, c, per, area = 0;

        System.out.println("What is your name: ");
        name = scan.nextLine();
        System.out.println("Enter value for Side 1: ");
        a = scan.nextInt();
        System.out.println("Enter value for Side 2: ");
        b = scan.nextInt();
        System.out.println("Enter value for Side 3: ");
        c =  scan.nextInt();

        per = a+b+c;
        double s = per/2;
        area = Math.sqrt(((s * (s-a)*(s-b)*(s-c))));

        System.out.println("Name: " + name);
        System.out.println("The Area of triangle = " + df.format(area));
        System.out.println("The Perimeter of triangle = " + df.format(per));

    }


}
