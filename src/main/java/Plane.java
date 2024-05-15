public class Plane extends Vehicle {

    private int flightHeight;

    public Plane(String make, int noOfWheels, int maxOccupancy, int price) {
        super(make, noOfWheels, maxOccupancy, price);
        this.flightHeight = 0;
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

    public void setFlightHeight(int flightHeight) {
        this.flightHeight = flightHeight;
    }


}
