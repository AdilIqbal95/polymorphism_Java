public class Car extends Vehicle {

    public Car(String make, int noOfWheels, int maxOccupancy, int price) {
        super(make, noOfWheels, maxOccupancy, price);

    }

    public String brake() {
        return "Car is braking";
    }

}
