import adapter.Adapter;
import builder.Car;
import builder.CarBuilder;

import observer.WeatherData;
import observer.WeatherDisplay;
import singleton.GameManager;

import java.util.Arrays;
import java.util.List;

public class Main {



    public static void main(String[] args) {
        GameManager anotherGameManager = GameManager.getInstance("League of Legends");
        GameManager gameManager = GameManager.getInstance("Halo 2");

        System.out.println(gameManager.msg);
        System.out.println(anotherGameManager.msg);

        CarBuilder carBuilder = new CarBuilder();
        Car car = carBuilder.setModel("Tesla Model S").setYear(2021).setColor("Red").setEngine("Electric").setTransmission("Automatic").build();
        System.out.println("The car built has the follow characteristics: Model: " + car.getModel() + " Year: " + car.getYear() + " Color: " + car.getColor() + " Engine: " + car.getEngine() + " Transmission: " + car.getTransmission());

        List<String> playList = Arrays.asList("apple", "melon", "pinneapple", "mango", "lemon");
        Adapter adapter = new Adapter("Manzana", playList);
        adapter.play();
        adapter.next();
        adapter.next();
        adapter.next();
        adapter.previous();
        adapter.stop();


        WeatherData weatherData = new WeatherData();
        WeatherDisplay weatherDisplay = new WeatherDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(89, 45, 36.4f);
    }

}