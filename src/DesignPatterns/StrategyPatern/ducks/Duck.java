package DesignPatterns.StrategyPatern.ducks;

import DesignPatterns.StrategyPatern.fly.FlyBehaviour;
import DesignPatterns.StrategyPatern.quack.QuckBehaviour;

public abstract class Duck {
    //priciple 2: Favour Composition over inheritence
    private FlyBehaviour flyBehaviour;
    private QuckBehaviour quckBehaviour;
    public Duck(FlyBehaviour flyBehaviour, QuckBehaviour quckBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quckBehaviour = quckBehaviour;
    }
    public abstract void display();
    public abstract void swim();
    public  void performFly(){
        flyBehaviour.fly();
    }
    public  void performQuack(){
        quckBehaviour.quack();
    }
    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }
    public void setQuckBehaviour(QuckBehaviour quckBehaviour) {
        this.quckBehaviour = quckBehaviour;
    }
}
