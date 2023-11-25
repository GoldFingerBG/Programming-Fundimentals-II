/*******************
  Nathaniel Bucknor-Smartt
  10/01/2023
  Module 4.3
  This program takes in stock info and shows the users stock position.
**********************/

import java.text.*;
public class Stock{
    private String ticker, company;
    private float shares, price;
    private NumberFormat nf = NumberFormat.getCurrencyInstance();

    public Stock(String ticker, String company, float shares, float price) {
        this.ticker = ticker;
        this.company = company;
        this.shares = shares;
        this.price = price;
    }

    public Stock() {
        this.ticker = "";
        this.company = "";
        this.shares = 0;
        this.price = 0;
    }



    public String getTicker() {
        return this.ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public float getShares() {
        return this.shares;
    }

    public void setShares(float shares) {
        this.shares = shares;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public double getStockPosition(float shares, float price){
        return shares * price;
    }

    public String getPositionSize(double cost){
        if(cost <= 2500){
            return "Small";
        }else if(cost > 2500 && cost < 5000){
            return "Medium";
        }else{
            return "Large";
        }
    }

    public void PrintStockInfo(){
        System.out.println("Symbol: " + ticker);
        System.out.println("Name: " + company);
        System.out.println("Shares Held: " + shares);
        System.out.println("Share Price: " + nf.format(price));
        System.out.println("Position Value: " + nf.format(getStockPosition(shares, price)));
        System.out.println("Position Size: " + getPositionSize(getStockPosition(shares, price)));
    }
}