package DesignPatterns.DecoratorPattern.v1.condements;

import DesignPatterns.DecoratorPattern.v1.Beverage;

public abstract class CondementDecorator extends Beverage {
    Beverage beverage;
//    public int price = 54;
    public  String description;
    public CondementDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
    public abstract double cost();
    public abstract String getDescription();
}
