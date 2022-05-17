public class ElectricCar extends Car{
    private int batteryCapacity;

    public ElectricCar(String name, int price, String colour, String model, String engine, int batterCapacity) {
        super(name, price, colour, model, engine);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }
}
