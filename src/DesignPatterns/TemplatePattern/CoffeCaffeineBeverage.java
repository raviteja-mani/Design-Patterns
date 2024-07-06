package DesignPatterns.TemplatePattern;

public class CoffeCaffeineBeverage extends CaffienBeverage{
    @Override
    public void brew() {
        System.out.println("coffe is being brewed");
    }

    @Override
    public void addCondiments() {
        System.out.println("adding something");
    }
}
