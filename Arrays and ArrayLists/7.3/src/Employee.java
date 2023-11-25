import java.util.*;
public class Employee {
    private String employeeID, firstName, lastName;
    private Benefits employeeBenefits;
    private Address employeeHomeAddress;


    public Employee(String employeeID, String firstName, String lastName, Benefits employeeBenefits, Address employeeHomeAddress) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeBenefits = employeeBenefits;
        this.employeeHomeAddress = employeeHomeAddress;
    }

    public String getEmployeeID() {
        return this.employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void PrintEmployeeInformation(ArrayList<Employee> work){

        for(int i = 0; i < work.size(); i++){
            System.out.println();
            System.out.println("Name: " + work.get(i).firstName + " " + work.get(i).lastName);
            System.out.println("Id: " + work.get(i).employeeID);

            work.get(i).employeeBenefits.PrintBenefitInfo();
            work.get(i).employeeHomeAddress.PrintAddressInformation();
        }
    }
}
