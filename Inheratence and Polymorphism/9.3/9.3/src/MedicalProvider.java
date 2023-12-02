import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList; 
public class MedicalProvider implements FileWrite{
    private String firstName, lastName, employeeID;
    private OfficeLocation employeeOfficeLocation;


    public MedicalProvider(String firstName, String lastName, String employeeID, OfficeLocation employeeOfficeLocation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.employeeOfficeLocation = employeeOfficeLocation;
    }

    public MedicalProvider(){
        firstName = "No Name";
        lastName = "No Name";
        employeeID = "No ID";
        employeeOfficeLocation = null;
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

    public String getEmployeeID() {
        return this.employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public OfficeLocation getEmployeeOfficeLocation() {
        return this.employeeOfficeLocation;
    }

    public void setEmployeeOfficeLocation(OfficeLocation employeeOfficeLocation) {
        this.employeeOfficeLocation = employeeOfficeLocation;
    }

    public void PrintInfo(){
        System.out.println(employeeID + ", " + firstName + " " + lastName + ": " + employeeID);
        employeeOfficeLocation.PrintInfo();
        System.out.println();
    }

    @Override
    public void writeToFile(ArrayList<MedicalProvider> f) {
        
    }

    public double WeeklyPayCheck(){
        return 0;
    }

    
}
