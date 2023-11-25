public class  Employee {
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

    public void PrintEmployeeInformation(){
        System.out.println();
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Id: " + employeeID);

        employeeBenefits.PrintBenefitInfo();
        employeeHomeAddress.PrintAddressInformation();
    }
    public Address getAddress(Address a){
        return a;
    }
    public Benefits getBenefits(Benefits a){
        return a;
    }
}
