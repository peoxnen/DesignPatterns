package iview.wsienski.designpatterns.observer;

/**
 * Created by Witold Sienski on 03.11.2016.
 */

public interface OfficerObserverable {

    void registerObserver(MyObserver soldierObserver);
    void removeObserver(MyObserver soldierObserver);
    void newCommandForObservers();
}
