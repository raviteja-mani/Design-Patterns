package DesignPatterns.StrategyPatern.quack;

public class Quack implements QuckBehaviour{
    @Override
    public void quack() {
        System.out.println("Quacking!");
    }
}
