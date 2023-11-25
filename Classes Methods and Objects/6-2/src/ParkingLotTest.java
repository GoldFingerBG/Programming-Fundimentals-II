/*******************
  Nathaniel Bucknor-Smartt
  10/25/2023
  Module 6.2
  This program takes in student information about themselves, their car, and address
  and relays it to the user. 
**********************/
import java.util.Scanner;
public class ParkingLotTest {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String firstName,lastName,street,city,state,zip,carMake,carModel;
        int carYear;

        Header.showHeader();
        System.out.println("What is your first name?: ");
        firstName = scan.nextLine();
        System.out.println("What is your last name?: ");
        lastName = scan.nextLine();
        System.out.println("What house do you live in? (House number and street name): ");
        street = scan.nextLine();
        System.out.println("What city do you live in?: ");
        city = scan.nextLine();
        System.out.println("What state do you live in?: ");
        state = scan.nextLine();
        System.out.println("What is your zip code?: ");
        zip = scan.nextLine();
        System.out.println("What is your cars make?: ");
        carMake = scan.nextLine();
        System.out.println("Whats your cars model?: ");
        carModel = scan.nextLine();
        System.out.println("What year is your car?: ");
        carYear = scan.nextInt();
        System.out.println();
        scan.close();

        ParkingPermit parkingPermit = new ParkingPermit(carYear,carMake,carModel);
        Address addy = new Address(street, city, state, zip);
        Student nathaniel = new Student(firstName, lastName, addy, parkingPermit);

        nathaniel.viewStudentInfo();
    }
}
