package DesignPatterns.FactoryPattern.v1.pizzas.NY;

import DesignPatterns.FactoryPattern.v1.Pizza;

import java.util.List;

public class NYStylePepparonPizza extends Pizza {
    private static String name = "NY Style Pepparon Pizza";

    public NYStylePepparonPizza( List<String> topping) {
        super(name, "dough", "special sauce", topping);
    }

    public String getName(){
        return name;
    }
}
