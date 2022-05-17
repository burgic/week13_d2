import java.util.ArrayList;

public class Customer {

    private String name;
    private int moneyAvailable;
    private ArrayList<Car> car;

    public String getName() {
        return name;
    }

    public int getMoneyAvailable() {
        return moneyAvailable;
    }

    public ArrayList<Car> getCar() {
        return car;
    }

    public Customer(String name, int moneyAvailable, ArrayList<Car> car) {
        this.name = name;
        this.moneyAvailable = moneyAvailable;
        this.car = new ArrayList<Car>();
    }
}
