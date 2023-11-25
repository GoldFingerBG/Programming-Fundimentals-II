/*******************
  Nathaniel Bucknor-Smartt
  11/10/223
  Module 8.2
  This program calculates, from a file, the total sales from the week, total sales of the month and their averages.
**********************/
import java.io.File;
import java.util.Scanner;
import java.text.DecimalFormat;
public class SalesMath {
    public static void main(String[] args) throws Exception {
        DecimalFormat df = new DecimalFormat("#.##");
        File f = new File("myFile.txt");
        Scanner scan = new Scanner(f);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        String month, week1 = "";
        sb1.append(scan.nextLine());
        week1 = sb1.toString();
        scan.close();

        Scanner scan1 = new Scanner(f);
        while(scan1.hasNextLine()){
            sb.append(scan1.nextLine());
            sb.append(",");
        }
        sb.deleteCharAt(sb.length()-1);
        month = sb.toString();
        scan1.close();

        System.out.println("We made $" + df.format(SalesMath.totalSalesEachWeek(week1)) + " in week one.");
        System.out.println("and that averages out to about $" + df.format(SalesMath.dailySalesAverage(week1)) + " per day in the week.");
        System.out.println("We made $" + df.format(SalesMath.totalWeeklySales(month)) + " in the month.");
        System.out.println("and that averages out to about $" + df.format(SalesMath.averageWeeklySales(month)) + "per day in the month.");
    }

    public static double totalSalesEachWeek(String s){
        int index = 0;
        String temp = s;// holds the unchecked part of the string
        double num = 0;// holds the number to be added to total
        double total = 0;// holds the total
        while(index <= s.length()){ //while the index is not at the end of the string
            if(temp.contains(",")){
                index = temp.indexOf(","); //find your next comma
                num = Double.parseDouble(temp.substring(0,index)); //set num to the number found
                index += 1; // move index past the comma
                temp = temp.substring(index); //move temp past the number found.
                total += num; // add number to the total
            }else{
                num = Double.parseDouble(temp);
                total += num;
                break;
            }
        } 
        return total;
    }

    public static double dailySalesAverage(String s){
        return (SalesMath.totalSalesEachWeek(s)/7);
    }

    public static double totalWeeklySales(String s){
        return SalesMath.totalSalesEachWeek(s);
    }
    
    public static double averageWeeklySales(String s){
        return SalesMath.totalSalesEachWeek(s)/21;
    }
}