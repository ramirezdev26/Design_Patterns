package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private List<Observer> observers;
    private double temperature;

    private double humidity;

    private double pressure;
    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update((float) temperature, (float) humidity, (float) pressure);
        }
    }
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    public float getTemperature() {
        return (float) temperature;
    }

    public float getHumidity() {
        return (float) humidity;
    }

    public float getPressure() {
        return (float) pressure;
    }
}
