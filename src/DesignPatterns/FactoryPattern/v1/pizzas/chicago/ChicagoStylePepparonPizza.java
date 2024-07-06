package DesignPatterns.FactoryPattern.v1.pizzas.chicago;

import DesignPatterns.FactoryPattern.v1.Pizza;

import java.util.List;

public class ChicagoStylePepparonPizza extends Pizza {
    private String name = "Chicago Style pepparon Pizza";

    public ChicagoStylePepparonPizza(List<String> topping) {
        super("Chicago Style pepparon Pizza", "dough", "special sauce", topping);
    }

    public String getName(){
        return name;
    }
}
