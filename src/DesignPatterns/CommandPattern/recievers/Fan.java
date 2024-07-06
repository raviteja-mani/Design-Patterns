package DesignPatterns.CommandPattern.recievers;

public class Fan implements  IReciever{
    private boolean action;
    private String name;
    public Fan(String name) {
        this.name = name;
    }
    public boolean isOn(){
        return action;
    }
    public void turnOn(){
        if(action) System.out.println(name+ " Fan is already on");
        else {
            action = true;
            System.out.println(name + " Fan is turned on");
        }
    }
    public void turnOff(){
        if(!action) System.out.println(name+ " Fan is already off");
        else {
            action = false;
            System.out.println(name + " Fan is turned off");
        }
    }
}
