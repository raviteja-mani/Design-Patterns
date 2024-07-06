package DesignPatterns.TemplatePattern;

public abstract class CaffienBeverage {
    public abstract void brew();
    public abstract void addCondiments();
    public void addMilk(){
        System.out.println("Milk added");
    }
    public void addSugar(){
        System.out.println("Sugar added");
    }
    public void prepare(){
        addMilk();
        brew();
        addCondiments();
        addSugar();
    }
}
