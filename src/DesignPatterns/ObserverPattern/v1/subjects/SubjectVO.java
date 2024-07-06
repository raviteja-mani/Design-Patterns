package DesignPatterns.ObserverPattern.v1.subjects;

//import java.util.Observer;

import DesignPatterns.ObserverPattern.v1.observers.IObserverVO;

public interface SubjectVO {
    public void registerObserver(IObserverVO o);
    public void removeObserver(IObserverVO o);
    public void notifyObservers();
}
