package DesignPatterns.StrategyPatern.quack;

public class Sqeak implements QuckBehaviour{
    @Override
    public void quack() {
        System.out.println("Sqeaking!");
    }
}
