package DesignPatterns.ObserverPattern.v1.observers;

public class CurrentCunditionsDisplay implements IObserverVO,IDisplayElement{
    private int temperature;
    private int humidity;
    private int pressure;
    @Override
    public void display() {
        // displays all data
        System.out.println("Displaying current cunditions");
        System.out.println("Temperature: " + temperature);
        System.out.println("Humidity: " + humidity);
        System.out.println("Pressure: " + pressure);
    }

    @Override
    public void update(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}