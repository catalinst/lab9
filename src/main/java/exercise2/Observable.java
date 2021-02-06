package exercise2;

import java.util.ArrayList;

/*
    this exercise is not finalized
 */

public class Observable {
    private ArrayList<Observer> observers = new ArrayList<>();

    public void changeState(Object event) {
        notifyAllObservers(event);
    }

    public void register(Observer observer) {
        observers.add(observer);
    }

    private void notifyAllObservers(Object event) {
        for (Observer observer : observers) {
            //observer.update(event);
        }
    }
}
