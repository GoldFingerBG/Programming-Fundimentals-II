import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Doctor extends MedicalProvider implements FileWrite{
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

    @Override
    public void PrintInfo(){
        System.out.println(super.getEmployeeID() + ", Type " + getClass().getSimpleName()+ ", " + super.getFirstName() + " " + super.getLastName() + ", " + super.getEmployeeOfficeLocation().getAddress() + ", \n " + super.getEmployeeOfficeLocation().getCity() + ", " + super.getEmployeeOfficeLocation().getState() + ", " + super.getEmployeeOfficeLocation().getZip() + ", and " + WeeklyPayCheck() + " Phone Number: " + super.getEmployeeOfficeLocation().getPhoneNumber());
        System.out.println();
    }

    public double WeeklyPayCheck(){
        return yearlySalary/52;
    }

    @Override
    public void writeToFile(ArrayList<MedicalProvider> f) {
        try{
            FileWriter file = new FileWriter("Medical.csv");
            for(int i = 0; i < f.size(); i++){
            file.write(f.get(i).getEmployeeID() + ", Type " + f.get(i).getClass().getSimpleName()+ ", " + f.get(i).getFirstName() + " " + f.get(i).getLastName() + ", " + f.get(i).getEmployeeOfficeLocation().getAddress() + ", " + f.get(i).getEmployeeOfficeLocation().getCity() + ", " + f.get(i).getEmployeeOfficeLocation().getState() + ", " + f.get(i).getEmployeeOfficeLocation().getZip() + ", and " + f.get(i).WeeklyPayCheck() + " Phone Number: " + f.get(i).getEmployeeOfficeLocation().getPhoneNumber());
            }
            System.out.println("Written to file!");
            file.close();
        }catch(Exception e){
            e.getStackTrace();
        }

    }
}
