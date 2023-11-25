/**
 * @author Kevin Roark
 * Person Class 
 * 	Class contains: First name, Last name, and age 
 * 10/07/2023
 * Modified by: Nathaniel Bucknor-Smartt
 * I added GPA and Phone Number to the fields and output statements 
 */
public class Person {
	//Attributes/fields
	private String firstName;
	private String lastName;
	private int personAge;
    private double GPA;
    private String PhoneNumber;
	/**************************************
	 * Constructors
	 **************************************/
	//Constructors (Default)
	public Person()
	{
		firstName = "None";
		lastName = "None";
		personAge = 0;
	}
	//Constructors (Populates data with arguments)
	public Person(String pFirst, String pLast, int pAge)
	{
		setFirstName(pFirst);
		setLastName(pLast);
		setPersonAge(pAge);		
	}


    public Person(String firstName, String lastName, int personAge, double GPA, String PhoneNumber) {
		setFirstName(firstName);
		setLastName(lastName);
		setPersonAge(personAge);
        setGPA(GPA);
        setPhoneNumber(PhoneNumber);
    }

	/**************************************
	 * Getters/Setters
	 **************************************/	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	/**************************************
	 * Methods 
	 **************************************/
	public String PrintData()
	{
		String myReturn = "";
		myReturn += "Name: " + getFirstName() + " " + getLastName();
		myReturn += ", Age: " + getPersonAge() + ", ";
		myReturn += " GPA: " + getGPA() + ", ";
		myReturn += " Phone: " + getPhoneNumber();

		return myReturn;
	}	


    public double getGPA() {
        return this.GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

} // END Person Class