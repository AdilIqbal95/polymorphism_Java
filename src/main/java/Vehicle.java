public abstract class Vehicle {

    private String make;
    private int noOfWheels;
    private int maxOccupancy;
    private int price;


    public Vehicle(String make, int noOfWheels, int maxOccupancy, int price) {
        this.make = make;
        this.noOfWheels = noOfWheels;
        this.maxOccupancy = maxOccupancy;
        this.price = price;
    }

    public String accelerate() {
        return "Vehicle is accelerating";
    }

//    getters and setters

    public String getMake() {
        return this.make;
    }

    public int getNoOfWheels() {
        return this.noOfWheels;
    }

    public int getMaxOccupancy() {
        return this.maxOccupancy;
    }

    public int getPrice() {
        return this.price;
    }

    public void setMake(String newMake) {
        this.make = newMake;
    }

    public void setNoOfWheels(int newNoOfWheels) {
        this.noOfWheels = newNoOfWheels;
    }

    public void setMaxOccupancy(int newtMaxOccupancy) {
        this.maxOccupancy = newtMaxOccupancy;
    }

    public void setPrice(int newPrice) {
        this.price = newPrice;
    }

}
