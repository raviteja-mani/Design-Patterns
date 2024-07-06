package DesignPatterns.CommandPattern;

import DesignPatterns.CommandPattern.commands.Command;

import java.util.ArrayList;

public class RemoteControl {
    private ArrayList<Command> onButtons;
    private ArrayList<Command> offButtons;
    public RemoteControl(int size) {
        onButtons = new ArrayList<>(size);
        offButtons = new ArrayList<>(size);
    }
    public void setCommand(int remoteNo,Command onCommand,Command offCommand) {
        onButtons.add(remoteNo-1,onCommand);
        offButtons.add(remoteNo-1,offCommand);
    }

    public void removeCommand(int remoteNo) {
        onButtons.remove(remoteNo-1);
        offButtons.remove(remoteNo-1);
    }
    public void onButtonPushed(int remoteNo) {
        if(remoteNo>onButtons.size()||onButtons.get(remoteNo-1)==null) {
            System.out.println("Button Not Available!");
        }
        else onButtons.get(remoteNo-1).execute();
    }
    public void offButtonPushed(int remoteNo) {
        if(remoteNo>offButtons.size()||offButtons.get(remoteNo-1)==null) {
            System.out.println("Button Not Available!");
        }
        else offButtons.get(remoteNo-1).execute();
    }
}
