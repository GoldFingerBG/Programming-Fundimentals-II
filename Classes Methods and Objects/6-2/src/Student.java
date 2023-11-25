public class Student {
    private String firstName,lastName;
    private Address address;
    private ParkingPermit parkingPermit;


    public Student(String firstName, String lastName, Address address, ParkingPermit parkingPermit) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.parkingPermit = parkingPermit;
    }
    
    public void viewStudentInfo(){
        System.out.println("*******Student Info********");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println();
        parkingPermit.viewParkingPermit();
        address.PrintAddressInformation();
        
    }
}
