package DesignPatterns.DecoratorPattern.v1;

public class DarkRoast extends Beverage{
    public int price = 54;
    public String description = "Dark Roast";

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double cost() {
        return this.price;
    }
}
