public class MedicalProvider {
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
        
    }
}
