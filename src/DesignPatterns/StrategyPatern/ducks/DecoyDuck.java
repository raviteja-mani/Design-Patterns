package DesignPatterns.StrategyPatern.ducks;

import DesignPatterns.StrategyPatern.fly.FlyBehaviour;
import DesignPatterns.StrategyPatern.fly.NoFlying;
import DesignPatterns.StrategyPatern.quack.MuteQuack;
import DesignPatterns.StrategyPatern.quack.QuckBehaviour;

public class DecoyDuck extends Duck{

    public DecoyDuck() {
        super(new NoFlying(), new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("I'm decoyed Duck");
    }

    @Override
    public void swim() {
        System.out.println("I can't swim");
    }
}
