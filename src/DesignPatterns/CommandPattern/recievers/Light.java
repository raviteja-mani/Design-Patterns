package DesignPatterns.CommandPattern.recievers;

public class Light implements  IReciever{
    private boolean action;
    private String name;
    public Light(String name) {
        this.name = name;
    }
    public boolean isOn(){
        return action;
    }
    public void turnOn(){
        if(action) System.out.println(name+ " Light is already  on");
        else {
            this.action = true;
            System.out.println(name + " Light turned on");
        }
    }
    public void turnOff(){
        if(!action) System.out.println(name+ " Light is already  off");
        else {
            this.action = false;
            System.out.println(name + " Light turned off");
        }
    }
}
