package DesignPatterns.ObserverPattern;

import DesignPatterns.ObserverPattern.v2.observers.CurrentCunditionsDisplay;
import DesignPatterns.ObserverPattern.v2.observers.ForecastDisplay;
import DesignPatterns.ObserverPattern.v2.subjects.WeatherData;

//WeatherStation client
public class Client {
//    public static void main1(String[] args) {
//        WeatherData weatherData = new WeatherData();
//        ForecastDisplay forecastDisplay = new ForecastDisplay();
//        weatherData.registerObserver(forecastDisplay);
//        weatherData.settingData(1,4,56);
//        CurrentCunditionsDisplay currentCunditionsDisplay = new CurrentCunditionsDisplay();
//        weatherData.registerObserver(currentCunditionsDisplay);
//        weatherData.settingData(15,45,86);
//        forecastDisplay.display();
//        currentCunditionsDisplay.display();
//        weatherData.removeObserver(currentCunditionsDisplay);
////        forecastDisplay.display();
//        weatherData.settingData(15,45,86);
//
//    }
    public static void main(String[] args) {
        DesignPatterns.ObserverPattern.v2.subjects.WeatherData weatherData = new DesignPatterns.ObserverPattern.v2.subjects.WeatherData();
        DesignPatterns.ObserverPattern.v2.observers.ForecastDisplay forecastDisplay = new DesignPatterns.ObserverPattern.v2.observers.ForecastDisplay(weatherData);
        weatherData.settingData(1,4,56);
        DesignPatterns.ObserverPattern.v2.observers.CurrentCunditionsDisplay currentCunditionsDisplay = new DesignPatterns.ObserverPattern.v2.observers.CurrentCunditionsDisplay(weatherData);
        weatherData.settingData(15,45,86);
        forecastDisplay.display();
        currentCunditionsDisplay.display();
        forecastDisplay.display();
    }
}
