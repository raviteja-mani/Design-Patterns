package DesignPatterns.DecoratorPattern.v1;

public abstract class Beverage {
//    public int price = 32;
    public String description;
    public abstract String getDescription();
    public abstract double cost();
}
