package DesignPatterns.DecoratorPattern.v1;

public class HouseBlend extends Beverage{
    public int price = 23;
    public String description = "House Blend";

    @Override
    public String getDescription() {
        return this.description;
    }
    @Override
    public double cost() {
        return this.price;
    }
}
