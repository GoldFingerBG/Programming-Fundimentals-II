public class ParkingPermit{
    private int permitID = (int)(Math.random() * 9999) + 1000;
    private int year;
    private String carMake,carModel;

    public ParkingPermit(int year, String carMake, String carModel) {
        this.year = year;
        this.carMake = carMake;
        this.carModel = carModel;
    }

    public ParkingPermit(ParkingPermit p) {
        this.permitID = p.permitID;
        this.year = p.year;
        this.carMake = p.carMake;
        this.carModel = p.carModel;
    }

    public void viewParkingPermit(){
        System.out.println("******Parking Permit*******");
        System.out.println("Permit ID: " + permitID);
        System.out.println("Make: " + carMake);
        System.out.println("Model: " + carModel);
        System.out.println("Year: " + year);
        System.out.println();
    }

    
}