package DesignPatterns.CommandPattern;


import DesignPatterns.CommandPattern.commands.*;
import DesignPatterns.CommandPattern.recievers.Fan;
import DesignPatterns.CommandPattern.recievers.IReciever;
import DesignPatterns.CommandPattern.recievers.Light;
import DesignPatterns.CommandPattern.recievers.PartyMacro;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl(5);
        Light bedroomLight = new Light("Bedroom Light");
        Light kitchenLight = new Light("Kitchen Light");
        Fan bedroomFan = new Fan("Bedroom Fan");
        Fan kitchenFan = new Fan("Kitchen Fan");
        PartyMacro party = new PartyMacro("Party ", List.of(new Light("movieroom"),new Fan("movieroom")));
        remote.setCommand(1,new LightOnCommand(bedroomLight),new LightOffCommand(bedroomLight));
        remote.setCommand(2,new LightOnCommand(kitchenLight),new LightOffCommand(kitchenLight));
        remote.setCommand(3,new FanOnCommand(bedroomFan),new FanOffCommand(bedroomFan));
        remote.setCommand(4,new FanOnCommand(kitchenFan),new FanOffCommand(kitchenFan));
        remote.setCommand(5,new PartyMacroOnCommand(party),new PartyMacroOffCommand(party));
        remote.offButtonPushed(1);
        remote.offButtonPushed(2);
        remote.offButtonPushed(3);
        remote.onButtonPushed(2);
        remote.offButtonPushed(3);
        remote.offButtonPushed(4);
        remote.onButtonPushed(5);
        remote.onButtonPushed(6);
        remote.offButtonPushed(5);
//        output:
//        Bedroom Light Light is already  off
//        Kitchen Light Light is already  off
//        Bedroom Fan Fan is already off
//        Kitchen Light Light turned on
//        Bedroom Fan Fan is already off
//        Kitchen Fan Fan is already off
//        movieroom Light turned on
//        movieroom Fan is turned on
//        Party Started!
//        Button Not Available!
//        movieroom Light turned off
//        movieroom Fan is turned off
//        Party Ended!


    }
}
