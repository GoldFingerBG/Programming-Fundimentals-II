import java.util.*;
public class StockTester {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String ticker, company;
        float shares, price;

        System.out.println("What is the ticker symbol?: ");
        ticker = scn.next();
        System.out.println("What is the company name?: ");
        scn.nextLine();
        company = scn.nextLine();
        System.out.println("How many shares do you have?:");
        shares = scn.nextFloat();
        System.out.println("How much is each share?: ");
        price = scn.nextFloat();
        scn.close();

        Stock stock = new Stock(ticker, company, shares, price);
        System.out.println();
        System.out.println();

        stock.PrintStockInfo();
        }
    }

