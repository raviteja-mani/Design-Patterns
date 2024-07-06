package DesignPatterns.ObserverPattern.v2.subjects;

import DesignPatterns.ObserverPattern.v1.observers.IObserverVO;

import java.util.ArrayList;

public class WeatherData implements SubjectVO {
    private int temperature;
    private int humidity;
    private int pressure;
    private ArrayList<IObserverVO> observers= new ArrayList<>();
    @Override
    public void registerObserver(IObserverVO o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(IObserverVO o) {
    observers.remove(o);
    }

    @Override
    public void notifyObservers() {
    for (IObserverVO observer : observers) {
        observer.update(temperature, humidity, pressure);
    }
    }
    public void settingData(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
//        notifyObservers();
    }
    public int getTemperature() {
        return temperature;
    }
    public int getHumidity() {
        return humidity;
    }
    public int getPressure() {
        return pressure;
    }

}
