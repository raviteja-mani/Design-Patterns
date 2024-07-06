package DesignPatterns.TemplatePattern;

import DesignPatterns.DecoratorPattern.v1.Beverage;

public class TeaCaffeinBeverage extends CaffienBeverage{

    @Override
    public void brew() {
        System.out.println("Tea shreading");
    }

    @Override
    public void addCondiments() {
    System.out.println("add Icecubes");
    }
}
