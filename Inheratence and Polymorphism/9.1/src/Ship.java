public class Ship {
    private String name, year;


    public Ship(String name, String year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    

    @Override
    public String toString() {
        return "The ships name is " + getName() + " and it was made in " + getYear() + "\n";
    }

}
