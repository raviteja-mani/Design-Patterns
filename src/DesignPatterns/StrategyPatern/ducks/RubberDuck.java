package DesignPatterns.StrategyPatern.ducks;

import DesignPatterns.StrategyPatern.fly.FlyBehaviour;
import DesignPatterns.StrategyPatern.fly.NoFlying;
import DesignPatterns.StrategyPatern.quack.QuckBehaviour;
import DesignPatterns.StrategyPatern.quack.Sqeak;

public class RubberDuck extends Duck{

    public RubberDuck() {
        super(new NoFlying(), new Sqeak());
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }

    @Override
    public void swim() {
        System.out.println("I'm swimming!");
    }
}
