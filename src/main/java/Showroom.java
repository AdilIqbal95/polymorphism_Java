import java.util.ArrayList;

public class Showroom {

    private ArrayList<Vehicle> stock;
    private int till;


    public Showroom() {
        this.stock = new ArrayList<>();
        this.till = 0;
    }

    public int vehicleCount(){
        return this.stock.size();
    }

    public void addVehicle(Vehicle vehicle){
        this.stock.add(vehicle);
    }

//    getters and setters
    public int getTill() {
        return this.till;
    }

    public ArrayList<Vehicle> getStock() {
        return this.stock;
    }

    public void setTill(int till) {
        this.till = till;
    }



}
