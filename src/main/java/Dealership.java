import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> vehicle;
    private int till;

    public Dealership(String vehicle, int till) {
        this.vehicle = new ArrayList<Vehicle>();
        this.till = till;
    }

    public void addVehicle(Vehicle vehicle){
        Vehicle Vehicle = null;
        this.vehicle.add(vehicle);
    }

    public Dealership() {

    }

    public int getVehicle() {
        return vehicle.size();
    }

    public int getTill() {
        return till;
    }
}
