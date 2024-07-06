package DesignPatterns.ObserverPattern.v2.observers;

import DesignPatterns.ObserverPattern.v2.subjects.WeatherData;

public class CurrentCunditionsDisplay implements IObserverVO, IDisplayElement {
    private int temperature;
    private int humidity;
    private int pressure;
    private WeatherData weatherData;
    public CurrentCunditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }
    @Override
    public void display() {
        // displays all data
        update();
        System.out.println("Displaying current cunditions");
        System.out.println("Temperature: " + temperature);
        System.out.println("Humidity: " + humidity);
        System.out.println("Pressure: " + pressure);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
//        display();
    }
}