package DesignPatterns.FactoryPattern.v1.pizzastore;

import DesignPatterns.FactoryPattern.v1.Pizza;
import DesignPatterns.FactoryPattern.v1.PizzaStore;
import DesignPatterns.FactoryPattern.v1.pizzas.NY.NYStyleCheesePizze;
import DesignPatterns.FactoryPattern.v1.pizzas.NY.NYStylePepparonPizza;
import DesignPatterns.FactoryPattern.v1.pizzas.PlainPizza;

import java.util.List;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza( String type, List<String> toppings) {
        if(type.equals("cheese")){
            return new NYStyleCheesePizze(toppings);
        }
        else if(type.equals("pepparon")){
            return new NYStylePepparonPizza(toppings);
        }
        else {
            return new PlainPizza(toppings);
        }
    }
}
