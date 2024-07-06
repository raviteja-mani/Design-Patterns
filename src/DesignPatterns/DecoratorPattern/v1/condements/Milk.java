package DesignPatterns.DecoratorPattern.v1.condements;

import DesignPatterns.DecoratorPattern.v1.Beverage;

public class Milk extends CondementDecorator{
    public int price = 5;
    public String description = "Milk";
    public Milk( Beverage beverage) {
        super(beverage);
    }
    public String getDescription() {
        return beverage.getDescription() +" "+ description;
    }
    @Override
    public double cost() {
        return beverage.cost() + this.price;
    }
}
