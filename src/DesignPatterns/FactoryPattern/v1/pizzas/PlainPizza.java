package DesignPatterns.FactoryPattern.v1.pizzas;

import DesignPatterns.FactoryPattern.v1.Pizza;

import java.util.List;

public class PlainPizza extends Pizza {
    public PlainPizza(List<String> toppings) {
        super("plain pizza", "dough", "soya sauce", toppings);
    }
}
