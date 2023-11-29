public class OfficeLocation {
    private String officeName, address, city, state, zip, phoneNumber;


    public OfficeLocation(String officeName, String address, String city, String state, String zip) {
        this.officeName = officeName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }


    public OfficeLocation() {
        officeName = "No Name";
        address = "No Address";
        city = "No City";
        state = "No State";
        zip = "No Zip";
    }


    public String getOfficeName() {
        return this.officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
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
    
    public void PrintInfo(){
        System.out.println(officeName + " at " + address + ", " + city + ", " + state + ", " + zip);
    }
}
