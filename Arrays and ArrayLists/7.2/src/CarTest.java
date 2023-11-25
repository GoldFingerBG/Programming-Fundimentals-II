/*******************
  Nathaniel Bucknor-Smartt
  11/3/2023
  Module 7.2
  This program displays cars in a car lot and calculates the price of all the vehicles 
**********************/
import java.util.ArrayList;
public class CarTest {
    public static void main(String[] args) throws Exception {
        ArrayList<Car> car = new ArrayList<Car>();

        car.add(new Car("Honda", "Civic Type R", 2023, 46000));
        car.add(new Car("Toyota", "Supra MK4", 1984, 80000));
        car.add(new Car("Volkswagen", "Golf GTI", 2012, 24000));
        car.add(new Car("Toyota", "Supra MK4", 1984, 80000));
        car.add(new Car("Chevy", "C8 Corvette", 2024, 100000));

        Car.displayInventory(car);
        Car.calculateTotalPrice(car);
    }
    

}
