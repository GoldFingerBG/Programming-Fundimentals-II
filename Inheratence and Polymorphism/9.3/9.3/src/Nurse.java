public class Nurse extends MedicalProvider{
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

}
