package builder;

public class Car {

    private String model;

    private int year;
    private String color;
    private String engine;
    private String transmission;

    public Car(String model, int year, String color, String engine, String transmission) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.engine = engine;
        this.transmission = transmission;
    }


    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    public String getTransmission() {
        return transmission;
    }



}
