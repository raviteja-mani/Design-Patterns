package DesignPatterns.CommandPattern.commands;

import DesignPatterns.CommandPattern.recievers.Light;

public class LightOnCommand implements Command {
    private Light light;
    public LightOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.turnOn();
    }
}
