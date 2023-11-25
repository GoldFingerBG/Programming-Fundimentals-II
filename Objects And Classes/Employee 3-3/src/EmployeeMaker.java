/*******************
  Nathaniel Bucknor-Smartt
  09/19/2023
  Module 3.3
  This program takes in information about an employee
  and relays it to the user.
**********************/
import java.util.*;
public class EmployeeMaker {
    public static void main(String[] args) throws Exception {

        String firstName;
        String lastName;
        int idnumber = 0;
        String department;
        String positon;
        String temp;

        //Employee 1 (default constructor)
        Employee tim = new Employee();
        tim.setFirstName("Tim");
        tim.setLastName("Burton");
        tim.setIdnumber(123498765);
        tim.setDepartment("Office Supplies");
        tim.setPositon("Front Desk Guy");
        
        //Employee 2 (perameter constructor)

        Scanner scan = new Scanner (System.in);
        System.out.println("What is your first name?:");
        firstName = scan.next();
        System.out.println("What is your last name?:");
        lastName = scan.next();
        System.out.println("What do you want your ID number to be?:");
        idnumber = scan.nextInt();
        System.out.println("What department were you hired to?:");
        temp = scan.nextLine();
        department = scan.nextLine();
        System.out.println("Whats your positon?:");
        positon = scan.nextLine();
        scan.close();

        Employee nathaniel = new Employee(firstName, lastName, idnumber, department, positon);

        System.out.println("--------Employee 1---------");
        System.out.println(tim.getFirstName());
        System.out.println(tim.getLastName());
        System.out.println(tim.getIdnumber());
        System.out.println(tim.getDepartment());
        System.out.println(tim.getPositon());
        System.out.println("---------Employee 2 --------");
        System.out.println(nathaniel.getFirstName());
        System.out.println(nathaniel.getLastName());
        System.out.println(nathaniel.getIdnumber());
        System.out.println(nathaniel.getDepartment());
        System.out.println(nathaniel.getPositon());
    }
}
