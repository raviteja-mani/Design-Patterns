package DesignPatterns.CommandPattern.recievers;

public interface IReciever {
    public boolean isOn();
    public void turnOn();
    public void turnOff();
}
