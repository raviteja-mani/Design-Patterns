package DesignPatterns.FactoryPattern.v1;

import java.util.List;

// can add ingredients to each pizza concrete class
public abstract class Pizza {
    private String name;
    private String dough;
    private String sauce;
    private List<String> topping = List.of("spice","meat","vegetable");
    private String bread;
    public Pizza(String name, String dough, String sauce, List<String> topping){
        this.name = name;
    }
    public  void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("adding sauce...");
        System.out.println("adding toppings...");
        for (String toppingName : topping) {
            System.out.println("Adding topping " + toppingName);
        }
    }
    public  void bake(){
        System.out.println("Baking for 25 minutes" + name);
    }
    public  void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public  void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }
}
