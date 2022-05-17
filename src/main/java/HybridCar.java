public class HybridCar extends Car {
    private int batteryCapacity;


    public HybridCar(String name, int price, String colour, String model, int engine, int batteryCapacity) {
        super(name, price, colour, model, String.valueOf(engine));
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

}
