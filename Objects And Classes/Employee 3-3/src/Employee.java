public class Employee {
    String firstName = "";
    String lastName = "";
    int idnumber = 000000000;
    String department = "";
    String positon = "";

    public Employee() {
        String firstName = "";
        String lastName = "";
        int idnumber = 000000000;
        String department = "";
        String positon = "";
    }

    public Employee(String firstName, String lastName, int idnumber, String department, String positon) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idnumber = idnumber;
        this.department = department;
        this.positon = positon;
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

    public int getIdnumber() {
        return this.idnumber;
    }

    public void setIdnumber(int idnumber) {
        this.idnumber = idnumber;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPositon() {
        return this.positon;
    }

    public void setPositon(String positon) {
        this.positon = positon;
    }

}
