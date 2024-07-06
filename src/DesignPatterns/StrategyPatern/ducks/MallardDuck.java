package DesignPatterns.StrategyPatern.ducks;

import DesignPatterns.StrategyPatern.fly.FlyBehaviour;
import DesignPatterns.StrategyPatern.fly.FlyWithWings;
import DesignPatterns.StrategyPatern.quack.Quack;
import DesignPatterns.StrategyPatern.quack.QuckBehaviour;

//principle 1: Encapsulate what varies
public class MallardDuck extends Duck {
    public MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck");
    }

    @Override
    public void swim() {
        System.out.println("I'm swimming!");
    }
}
