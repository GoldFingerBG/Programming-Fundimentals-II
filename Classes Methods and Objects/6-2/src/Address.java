public class Address{
    private String street, city, state, zip;


    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Address(Address a){
        this.street = a.street;
        this.city = a.city;
        this.state = a.state;
        this.zip = a.zip;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }


    public void PrintAddressInformation(){
        System.out.println("**********Address**********");
        System.out.println(getStreet() + ", " + getCity() + ", " + getState() + ", " + getZip());
        System.out.println();
    }
}