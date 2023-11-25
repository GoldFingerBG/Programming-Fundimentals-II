public class CruiseShip extends Ship {
    private int passengers;

    public CruiseShip(String name, String year, int passengers){
        super(name, year);
        this.passengers = passengers;
    }


    public int getPassengers() {
        return this.passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }


    @Override
    public String toString() {
        return "The ships name is " + getName() + " and it was made in " + getYear() + " and can hold " + getPassengers() + " people.\n";
    }
    

}
