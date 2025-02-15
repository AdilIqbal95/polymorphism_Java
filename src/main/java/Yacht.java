public class Yacht extends Vehicle {

    private int noOfRooms;

    public Yacht(String make, int noOfWheels, int maxOccupancy, int price, int noOfRooms) {
        super(make, noOfWheels, maxOccupancy, price);
        this.noOfRooms = noOfRooms;
    }

    public String deployLifeBoat() {
        return "Life boat deployed";
    }

    @Override
    public String reduceSpeed() {
        return "This yacht is reducing it's speed";
    }

//    getters and setters
    public int getNoOfRooms() {
        return this.noOfRooms;
    }

    public void setNoOfRooms(int newNoOfRooms) {
        this.noOfRooms = newNoOfRooms;
    }



}
