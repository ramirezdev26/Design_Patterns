package builder;

public class CarBuilder {

    private String model;
    private int year;
    private String color;
    private String engine;
    private String transmission;

    public CarBuilder setModel(String model){
        this.model = model;
        return this;
    }

    public CarBuilder setYear(int year){
        this.year = year;
        return this;
    }

    public CarBuilder setColor(String color){
        this.color = color;
        return this;
    }

    public CarBuilder setEngine(String engine){
        this.engine = engine;
        return this;
    }

    public CarBuilder setTransmission(String transmission){
        this.transmission = transmission;
        return this;
    }

    public Car build() {
        return new Car(model, year, color, engine, transmission);
    }

}
