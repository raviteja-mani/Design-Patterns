package DesignPatterns.ObserverPattern.v1.observers;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ForecastDisplay implements IObserverVO,IDisplayElement{
    private ArrayList<Integer> temperatureList = new ArrayList<>();
    private ArrayList<Integer> humidityList = new ArrayList<>();
    private ArrayList<Integer> pressureList = new ArrayList<>();
    @Override
    public void display() {
        // displays all data
        System.out.println("Displaying Forecast");
        System.out.println("Temperature: " + temperatureList.getLast());
        System.out.println("Humidity: " + humidityList.getLast());
        System.out.println("Pressure: " + pressureList.getLast());
        System.out.println("Avg temperature: " + getAverageTemperature());
        System.out.println("Avg humidity: " + getAverageHumidity());
        System.out.println("Avg pressure: " + getAveragePressure());

    }
    public int getAverageTemperature() {
        int sum = 0;
        for (int i = 0; i < temperatureList.size(); i++) {
            sum += temperatureList.get(i);
        }
        return sum / temperatureList.size();
    }

    public int getAverageHumidity() {
        int sum = 0;
        for (int i = 0; i < humidityList.size(); i++) {
            sum += humidityList.get(i);
        }
        return sum / humidityList.size();
    }
    public int getAveragePressure() {
        int sum = 0;
        for (int i = 0; i < pressureList.size(); i++) {
            sum += pressureList.get(i);
        }
        return sum / pressureList.size();
    }
    @Override
    public void update(int temperature, int humidity, int pressure) {
    this.temperatureList.add(temperature);
    this.humidityList.add(humidity);
    this.pressureList.add(pressure);
    display();
    }


}
