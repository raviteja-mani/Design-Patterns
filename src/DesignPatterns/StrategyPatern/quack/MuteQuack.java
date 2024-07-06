package DesignPatterns.StrategyPatern.quack;

public class MuteQuack implements  QuckBehaviour {
    @Override
    public void quack() {
        System.out.println("Mute Quack");
    }
}
