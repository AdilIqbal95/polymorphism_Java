public class Plane extends Vehicle implements IDrive {

    private int flightHeight;

    public Plane(String make, int noOfWheels, int maxOccupancy, int price) {
        super(make, noOfWheels, maxOccupancy, price);
        this.flightHeight = 0;
    }

    @Override
    public String reduceSpeed() {
        return "This plane is reducing it's speed";
    }

    public String drive() {
        return "This plane is driven whilst at the airport";
    }

    public void takeoff() {
        this.flightHeight = 10000;
    }

    public void takeoff(int height) {
        this.flightHeight = height;
    }

    public void land() {
        this.flightHeight = 0;
    }

//    getters and setters
    public int getFlightHeight() {
        return this.flightHeight;
    }

}
