package DesignPatterns.FactoryPattern.v1.pizzas.NY;

import DesignPatterns.FactoryPattern.v1.Pizza;

import java.util.List;

public class NYStyleCheesePizze extends Pizza {
    private static String name = "NY Style Cheese Pizza";

    public NYStyleCheesePizze( List<String> topping) {
        super(name, "dough", "soya sauce", topping);
    }

    public String getName(){
        return name;
    }
}
