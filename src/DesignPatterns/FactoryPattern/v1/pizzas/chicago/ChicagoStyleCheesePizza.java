package DesignPatterns.FactoryPattern.v1.pizzas.chicago;

import DesignPatterns.FactoryPattern.v1.Pizza;

import java.util.List;

public class ChicagoStyleCheesePizza extends Pizza {
    private static String name = "Chicago Style Cheese Pizza";

    public ChicagoStyleCheesePizza(List<String> topping) {
        super(name, "dough", "chicago special sauce", topping);
    }

    public String getName(){
        return name;
    }
}
