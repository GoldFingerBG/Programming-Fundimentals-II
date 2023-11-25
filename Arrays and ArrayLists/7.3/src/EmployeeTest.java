/*******************
  Nathaniel Bucknor-Smartt
  11/3/2023
  Module 7.3
  This program displays information from a list of employees with addresses and benefits
**********************/
import java.util.*;

public class EmployeeTest {
    public static void main(String[] args) {

        ArrayList<Employee> work = new ArrayList<Employee>();

        System.out.println("*******************************");
        System.out.println("Welcome to the employee portal!");
        System.out.println("*******************************");

        Benefits ben = new Benefits("Health", "Obama Care", 495);

        Address addy1 = new Address("123 Boardfish Road", "San Antonio", "Texas", "78957");
        Address addy2 = new Address("456 Candy Lane", "San Antonio", "Texas", "78957");
        Address addy3 = new Address("789 Jacob Place", "San Antonio", "Texas", "78957");
        Address addy4 = new Address("937 GoldFinger Blv", "San Antonio", "Texas", "78957");
        
        Employee nate = new Employee("123472567" , "Nate", "Bucknor", ben, addy1);
        Employee bella = new Employee("22342547", "Bella", "Smartt", ben, addy2);
        Employee Jacob = new Employee("3234567", "Jacob", "Jones", ben, addy3);
        Employee Syrup = new Employee("42375687", "Syrup", "King", ben, addy4);

        work.add(new Employee("123472567" , "Nate", "Bucknor", ben, addy1));
        work.add(new Employee("22342547", "Bella", "Smartt", ben, addy2));
        work.add(new Employee("3234567", "Jacob", "Jones", ben, addy3));
        work.add(new Employee("42375687", "Syrup", "King", ben, addy4));

        nate.PrintEmployeeInformation(work);
    }
}
