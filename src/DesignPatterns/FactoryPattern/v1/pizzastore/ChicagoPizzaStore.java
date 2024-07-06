package DesignPatterns.FactoryPattern.v1.pizzastore;

import DesignPatterns.FactoryPattern.v1.Pizza;
import DesignPatterns.FactoryPattern.v1.PizzaStore;
import DesignPatterns.FactoryPattern.v1.pizzas.PlainPizza;
import DesignPatterns.FactoryPattern.v1.pizzas.chicago.ChicagoStyleCheesePizza;
import DesignPatterns.FactoryPattern.v1.pizzas.chicago.ChicagoStylePepparonPizza;

import java.util.List;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type, List<String> toppings) {
        if(type.equals("cheese")){
            return new ChicagoStyleCheesePizza(toppings);
        }
        else if(type.equals("pepparon")){
            return new ChicagoStylePepparonPizza(toppings);
        }
        else{
            return new PlainPizza(toppings);
        }
    }
}
