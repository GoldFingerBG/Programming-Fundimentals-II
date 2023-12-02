import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Nurse extends MedicalProvider implements FileWrite{
    private String type;
    private double hourlyRate,hoursWorked;

    public Nurse(String firstName, String lastName, String employeeID, OfficeLocation o, String type, double hourlyRate, double hoursWorked) {
        super(firstName, lastName, employeeID, o);
        this.type = type;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public Nurse(MedicalProvider m, String type, double hourlyRate, double hoursWorked) {
        super(m.getFirstName(), m.getLastName(), m.getEmployeeID(), m.getEmployeeOfficeLocation());
        this.type = type;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public Nurse(String type, double hourlyRate, double hoursWorked) {
        this.type = type;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public Nurse() {
        type = "No Type";
        hourlyRate = 0;
        hoursWorked = 0;
    }

    public void PrintInfo(){
        System.out.println(super.getEmployeeID() + ", Type " + getClass().getSimpleName()+ ", " + super.getFirstName() + " " + super.getLastName() + ", " + super.getEmployeeOfficeLocation().getAddress() + ", \n " + super.getEmployeeOfficeLocation().getCity() + ", " + super.getEmployeeOfficeLocation().getState() + ", " + super.getEmployeeOfficeLocation().getZip() + ", and " + WeeklyPayCheck() + " Phone Number: " + super.getEmployeeOfficeLocation().getPhoneNumber());
        System.out.println();
    }

    public double WeeklyPayCheck(){
        return hourlyRate*hoursWorked;
    }

    @Override
    public void writeToFile(ArrayList<MedicalProvider> f) {
        try{
            FileWriter file = new FileWriter("Medical.csv");
            for(int i = 0; i < f.size(); i++){
            file.write(f.get(i).getEmployeeID() + ", Type " + f.get(i).getClass().getSimpleName()+ ", " + f.get(i).getFirstName() + " " + f.get(i).getLastName() + ", " + f.get(i).getEmployeeOfficeLocation().getAddress() + ", \n " + f.get(i).getEmployeeOfficeLocation().getCity() + ", " + f.get(i).getEmployeeOfficeLocation().getState() + ", " + f.get(i).getEmployeeOfficeLocation().getZip() + ", and " + f.get(i).WeeklyPayCheck() + " Phone Number: " + f.get(i).getEmployeeOfficeLocation().getPhoneNumber());
            file.write("\n");
            }
            System.out.println("Written to file!");
            file.close();
        }catch(Exception e){
            e.getStackTrace();
        }

    }
    }

