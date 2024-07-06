package DesignPatterns.DecoratorPattern;

import DesignPatterns.DecoratorPattern.v1.Beverage;
import DesignPatterns.DecoratorPattern.v1.Decaf;
import DesignPatterns.DecoratorPattern.v1.condements.Milk;
import DesignPatterns.DecoratorPattern.v1.condements.Soya;

public class Client {
    public static void main(String[] args) {

        Beverage decaf =new Soya(new Milk(new Decaf()));
            System.out.println(decaf.getDescription());
        System.out.println("Cost: "+decaf.cost());
    }
}
