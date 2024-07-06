package DesignPatterns.CommandPattern.commands;

import DesignPatterns.CommandPattern.recievers.PartyMacro;

public class PartyMacroOnCommand implements Command{
    private PartyMacro partyMacro;
    public PartyMacroOnCommand(PartyMacro partyMacro) {
        this.partyMacro = partyMacro;
    }
    @Override
    public void execute() {
        partyMacro.turnOn();
    }
}
