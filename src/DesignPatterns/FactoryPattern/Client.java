package DesignPatterns.FactoryPattern;

import DesignPatterns.FactoryPattern.v1.Pizza;
import DesignPatterns.FactoryPattern.v1.PizzaStore;
import DesignPatterns.FactoryPattern.v1.pizzastore.ChicagoPizzaStore;
import DesignPatterns.FactoryPattern.v1.pizzastore.NYPizzaStore;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        PizzaStore nypizzaStore = new NYPizzaStore();
        nypizzaStore.orderPizza("cheese", List.of("chicken","extra cheese"));
        nypizzaStore.orderPizza("pepperoni", List.of("meat","butter"));
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        chicagoStore.orderPizza("cheese", List.of("mutton","extra cheese"));
        chicagoStore.orderPizza("pepperoni", List.of("meat","butter"));
    }
//output:
//    Preparing NY Style Cheese Pizza
//    Tossing dough...
//    adding sauce...
//    adding toppings...
//    Adding topping spice
//    Adding topping meat
//    Adding topping vegetable
//    Baking for 25 minutesNY Style Cheese Pizza
//    Cutting the pizza into diagonal slices
//    Place pizza in official PizzaStore box
//    Preparing plain pizza
//    Tossing dough...
//    adding sauce...
//    adding toppings...
//    Adding topping spice
//    Adding topping meat
//    Adding topping vegetable
//    Baking for 25 minutesplain pizza
//    Cutting the pizza into diagonal slices
//    Place pizza in official PizzaStore box
//    Preparing Chicago Style Cheese Pizza
//    Tossing dough...
//    adding sauce...
//    adding toppings...
//    Adding topping spice
//    Adding topping meat
//    Adding topping vegetable
//    Baking for 25 minutesChicago Style Cheese Pizza
//    Cutting the pizza into diagonal slices
//    Place pizza in official PizzaStore box
//    Preparing plain pizza
//    Tossing dough...
//    adding sauce...
//    adding toppings...
//    Adding topping spice
//    Adding topping meat
//    Adding topping vegetable
//    Baking for 25 minutesplain pizza
//    Cutting the pizza into diagonal slices
//    Place pizza in official PizzaStore box
}
