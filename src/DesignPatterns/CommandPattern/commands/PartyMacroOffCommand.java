package DesignPatterns.CommandPattern.commands;

import DesignPatterns.CommandPattern.recievers.PartyMacro;

public class PartyMacroOffCommand implements Command{
    private PartyMacro partyMacro;
    public PartyMacroOffCommand(PartyMacro partyMacro) {
        this.partyMacro = partyMacro;
    }
    @Override
    public void execute() {
        partyMacro.turnOff();
    }
}
