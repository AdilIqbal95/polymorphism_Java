public class Car extends Vehicle implements IDrive {

    public Car(String make, int noOfWheels, int maxOccupancy, int price) {
        super(make, noOfWheels, maxOccupancy, price);

    }

    @Override
    public String reduceSpeed() {
        return "This car is reducing it's speed";
    }

    public String drive() {
        return "This car is driven around town";
    }
}
