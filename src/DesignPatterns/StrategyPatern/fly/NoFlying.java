package DesignPatterns.StrategyPatern.fly;

public class NoFlying implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("No flying");
    }
}
