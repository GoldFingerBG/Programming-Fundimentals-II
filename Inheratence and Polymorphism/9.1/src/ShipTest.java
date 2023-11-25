import java.util.Scanner;
public class ShipTest {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int tonnage, passengers;
        String name, name1, year, year1;

        System.out.println("What is the name of your Cruise ship?");
        name = scan.nextLine();
        System.out.println("What year was it made?");
        year = scan.nextLine();
        System.out.println("How many passengers can it hold?");
        passengers = scan.nextInt();
        System.out.println("What is the name of your Cargo ship?");
        scan.nextLine();
        name1 = scan.nextLine();
        System.out.println("What year was it made?");
        year1 = scan.nextLine();
        System.out.println("How much can it tow?");
        tonnage = scan.nextInt();
        scan.close();

        CargoShip ship = new CargoShip(name1, year1, tonnage);
        CruiseShip ship2 = new CruiseShip(name, year, passengers);

        System.out.println(ship.toString());
        System.out.println(ship2.toString());
    }
}
