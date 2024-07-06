package DesignPatterns.StrategyPatern;

import DesignPatterns.StrategyPatern.ducks.DecoyDuck;
import DesignPatterns.StrategyPatern.ducks.Duck;
import DesignPatterns.StrategyPatern.ducks.MallardDuck;
import DesignPatterns.StrategyPatern.ducks.RubberDuck;

//this is a duck simulator
public class Client {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        Duck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performQuack();
        Duck mallordDuck = new MallardDuck();
        mallordDuck.display();
        mallordDuck.performFly();
        mallordDuck.performQuack();
    }
}
