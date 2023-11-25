public class Hourly extends Employee{
    private double Hourly;
    private int hoursPerWeek;

    public Hourly(String firstName, String lastName, String employeeID, double Hourly, int hoursPerWeek, Benefits eb, Address ea) {
        super(employeeID, firstName, lastName, eb, ea);
        this.Hourly = Hourly;
        this.hoursPerWeek = hoursPerWeek;
    }

    public Hourly(double Hourly, int hoursPerWeek, Benefits eb, Address ea) {
        super("644257", "Nathaniel", "Bucknor-Smartt", eb, ea);
        this.Hourly = Hourly;
        this.hoursPerWeek = hoursPerWeek;
    }

    public double CalculatePay(){
        return (Hourly*hoursPerWeek);
    }

    @Override
    public void PrintEmployeeInformation(){
        System.out.println();
        System.out.println("Name: " + super.getFirstName() + " " + super.getLastName());
        System.out.println("Id: " + super.getEmployeeID());

        System.out.println("You get paid " + Hourly + " per hour and with " + hoursPerWeek + " hours per week you will be paid " + CalculatePay() + " every week.");
    }



}
