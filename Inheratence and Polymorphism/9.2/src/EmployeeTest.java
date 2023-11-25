/*******************
  Nathaniel Bucknor-Smartt
  10/25/2023
  Module 6.1
  This program takes in employee information about benefits and addresses and relays it to the user. 
**********************/
import java.util.ArrayList;
public class EmployeeTest {
    public static void main(String[] args) throws Exception {
        System.out.println("*******************************");
        System.out.println("Welcome to the employee portal!");
        System.out.println("*******************************");

        Benefits ben = new Benefits("Health", "Obama Care", 495);
        Address addy = new Address("123 Boardfish Road", "San Antonio", "Texas", "78957");
        ArrayList<Employee> emp = new ArrayList<Employee>();

        emp.add(new Salary("Nathaniel", "Bucknor", "644257", 70000, 1000, ben, addy));
        emp.add(new Salary("Zachary", "Smartt", "654321", 80000, 1000, ben, addy));
        emp.add(new Hourly("Madison","Hernandez","234561",14.0,25,ben,addy));
        emp.add(new Hourly("Jacob", "Jones", "987654", 10.0, 32, ben, addy));

        int count = 0;
        while(count < emp.size()){
          emp.get(count).PrintEmployeeInformation();
          count++;
        }
        
    }
}
