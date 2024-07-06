package DesignPatterns.DecoratorPattern.v1;

public class Decaf extends Beverage {
    public int price = 32;
    public String description = "Decaf";

    @Override
    public String getDescription() {
        return this.description;
    }
    @Override
    public double cost() {
        return this.price;
    }
}
