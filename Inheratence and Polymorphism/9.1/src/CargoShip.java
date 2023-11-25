public class CargoShip extends Ship{
    private int tonnage;

    public CargoShip(String name, String year, int tonnage){
        super(name,year);
        this.tonnage = tonnage;
    }


    public int getTonnage() {
        return this.tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }


    @Override
    public String toString() {
        return "The ships name is " + getName() + " and it was made in " + getYear() + " and can tow " + getTonnage() + " tons.\n";
    }

}
