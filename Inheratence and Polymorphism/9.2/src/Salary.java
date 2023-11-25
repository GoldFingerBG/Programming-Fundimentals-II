public class Salary extends Employee{
    private int annualSalary, monthlyBonus;

    public Salary(String firstName, String lastName, String employeeID, int annualSalary, int monthlyBonus, Benefits eb, Address ea){
        super(employeeID, firstName, lastName, eb, ea);
        this.annualSalary = annualSalary;
        this.monthlyBonus = monthlyBonus;
    }

    public Salary(int annualSalary, int monthlyBonus, Benefits eb, Address ea){
        super("644257", "Nathaniel", "Bucknor-Smartt", eb, ea);
        this.annualSalary = annualSalary;
        this.monthlyBonus = monthlyBonus;
    }

    public double CalculatePay(){

        return annualSalary/24;

    }

    @Override
    public void PrintEmployeeInformation(){
        System.out.println();
        System.out.println("Name: " + super.getFirstName() + " " + super.getLastName());
        System.out.println("Id: " + super.getEmployeeID());

        System.out.println("Your salary is " + annualSalary + " and you will be payed " + CalculatePay() + " every 2 weeks.");
    }
}
