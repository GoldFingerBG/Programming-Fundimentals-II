/*******************
  Nathaniel Bucknor-Smartt
  10/25/2023
  Module 6.1
  This program takes in employee information about benefits and addresses and relays it to the user. 
**********************/
import java.util.Scanner;
public class EmployeeTest {
    public static void main(String[] args) throws Exception {
        String userID, firstName, lastName;
        System.out.println("*******************************");
        System.out.println("Welcome to the employee portal!");
        System.out.println("*******************************");

        Benefits ben = new Benefits("Health", "Obama Care", 495);
        Address addy = new Address("123 Boardfish Road", "San Antonio", "Texas", "78957");

        Scanner scan = new Scanner(System.in);

        System.out.println("Whats your user ID?: ");
        userID = scan.nextLine();
        System.out.println("Whats your first name?: ");
        firstName = scan.nextLine();
        System.out.println("Whats your last name?: ");
        lastName = scan.nextLine();
        scan.close();
        Employee nathaniel = new Employee(userID, firstName, lastName, ben, addy);

        nathaniel.PrintEmployeeInformation();
    }
}
