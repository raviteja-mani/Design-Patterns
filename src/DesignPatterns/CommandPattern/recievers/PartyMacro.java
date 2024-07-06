package DesignPatterns.CommandPattern.recievers;

import DesignPatterns.CommandPattern.commands.Command;

import java.util.ArrayList;
import java.util.List;

public class PartyMacro implements  IReciever{
    private String name;
    private List<IReciever> reciversList;
    public PartyMacro(String name, List<IReciever> reciversList) {
    this.name = name;
    this.reciversList = reciversList;
    }

    @Override
    public boolean isOn() {
        for (IReciever reciver : reciversList) {
            if (!reciver.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void turnOn() {
    for (IReciever reciver : reciversList) {
       reciver.turnOn();
    }
        System.out.println("Party Started!");
    }

    @Override
    public void turnOff() {
    for (IReciever reciver : reciversList) {
        reciver.turnOff();
    }
        System.out.println("Party Ended!");
    }
}
