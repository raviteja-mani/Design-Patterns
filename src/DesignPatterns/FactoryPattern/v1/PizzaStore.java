package DesignPatterns.FactoryPattern.v1;

import java.util.List;

public abstract class PizzaStore {
    private Pizza pizza;
    public abstract Pizza createPizza(String type, List<String> toppings);
    public void orderPizza(String type, List<String> toppings) {
        pizza = createPizza(type,toppings);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
