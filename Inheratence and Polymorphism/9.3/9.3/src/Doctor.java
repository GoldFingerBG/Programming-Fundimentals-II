public class Doctor extends MedicalProvider{
    private String specialty, licenseNumber, roomNumber;
    private double yearlySalary;

    public Doctor(String firstName, String lastName, String employeeID, OfficeLocation o, String specialty, String licenseNumber, String roomNumber, double yearlySalary) {
        super(firstName, lastName, employeeID, o);
        this.specialty = specialty;
        this.licenseNumber = licenseNumber;
        this.roomNumber = roomNumber;
        this.yearlySalary = yearlySalary;
    }
    
    public Doctor(MedicalProvider m, String specialty, String licenseNumber, String roomNumber, double yearlySalary) {
        super(m.getFirstName(), m.getLastName(), m.getEmployeeID(), m.getEmployeeOfficeLocation());
        this.specialty = specialty;
        this.licenseNumber = licenseNumber;
        this.roomNumber = roomNumber;
        this.yearlySalary = yearlySalary;
    }

    public Doctor(String specialty, String licenseNumber, String roomNumber, double yearlySalary) {
        this.specialty = specialty;
        this.licenseNumber = licenseNumber;
        this.roomNumber = roomNumber;
        this.yearlySalary = yearlySalary;
    }

    public Doctor() {
        specialty = "Not Special";
        licenseNumber = "No Number";
        roomNumber = "No Room Number";
        yearlySalary = 0;
    }

    public String getSpecialty() {
        return this.specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getLicenseNumber() {
        return this.licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getRoomNumber() {
        return this.roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getYearlySalary() {
        return this.yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public void PrintInfo(){

    }

    public double WeeklyPayCheck(){
        return 0;
    }
}
