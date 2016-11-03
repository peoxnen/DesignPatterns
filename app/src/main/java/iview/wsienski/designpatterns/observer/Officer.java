package iview.wsienski.designpatterns.observer;

import java.util.ArrayList;

/**
 * Created by Witold Sienski on 03.11.2016.
 */

public class Officer implements OfficerObserverable {

    private ArrayList observers;
    private String name;
    private int priority;

    public Officer() {
        this.observers = new ArrayList();
    }

    @Override
    public void registerObserver(MyObserver soldierObserver) {
        observers.add(soldierObserver);
    }

    @Override
    public void removeObserver(MyObserver soldierObserver) {
        int i = observers.indexOf(soldierObserver);
        if(i >= 0){
            observers.remove(soldierObserver);
        }
    }

    @Override
    public void newCommandForObservers() {
        for (int i = 0; i < observers.size(); i++) {
            MyObserver myObserver = (MyObserver) observers.get(i);
            myObserver.doCommand(name, priority);
        }
    }

    public void giveCommand(String name, int priority){
        this.name=name;
        this.priority=priority;
        newCommandForObservers();
    }
}
