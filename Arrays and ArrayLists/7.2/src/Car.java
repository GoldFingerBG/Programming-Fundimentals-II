import java.util.ArrayList;
public class Car {
    private String make, model;
    private int year;
    private double price;


    public Car() {
    }


    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }


    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void displayInventory(ArrayList<Car> Car){

        System.out.println("------ Nathaniel's Car Lot ------");

        for(int i = 0; i < Car.size(); i++){

            System.out.println((i + 1) + ". " + Car.get(i).getYear() + " " + Car.get(i).getMake() + " " + Car.get(i).getModel() + " | $" + Car.get(i).getPrice());

        }
        System.out.println();
    }

    
    public static void calculateTotalPrice(ArrayList<Car> Car){

        double total = 0;

        for(int i = 0; i < Car.size(); i++){
            total += Car.get(i).getPrice();
        }   

        System.out.println("------ Total Price of the Lot ------");
        System.out.println("Total: $" + total);
        
    }
}