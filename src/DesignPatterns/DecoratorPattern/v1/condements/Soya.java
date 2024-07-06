package DesignPatterns.DecoratorPattern.v1.condements;

import DesignPatterns.DecoratorPattern.v1.Beverage;

public class Soya extends CondementDecorator{
public int price = 10;
public String description = "Soya ";
    public Soya(Beverage beverage) {
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
