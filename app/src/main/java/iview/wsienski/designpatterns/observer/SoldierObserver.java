package iview.wsienski.designpatterns.observer;

import android.util.Log;

/**
 * Created by Witold Sienski on 03.11.2016.
 */

public class SoldierObserver implements MyObserver{

    private final static String TAG = SoldierObserver.class.getSimpleName();

    private OfficerObserverable officerObserverable;

    public SoldierObserver(OfficerObserverable officerObserverable) {
        this.officerObserverable = officerObserverable;
        officerObserverable.registerObserver(this);
    }

    @Override
    public void doCommand(String name, int priority) {
        Log.d(TAG, "name: "+name+" priority:"+priority);
    }
}
