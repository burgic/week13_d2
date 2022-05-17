public abstract class Car {

    private String name;
    private int price;
    private String colour;
    private String model;
    private String engine;


    public Car(String name, int price, String colour, String model, String engine) {
        this.name = name;
        this.price = price;
        this.colour = colour;
        this.model = model;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }
}
