package iview.wsienski.designpatterns.observer;

import android.util.Log;

/**
 * Created by Witold Sienski on 03.11.2016.
 */

public class AxemanObserver implements MyObserver {

    private final static String TAG = AxemanObserver.class.getSimpleName();

    private OfficerObserverable officerObserverable;

    public AxemanObserver(OfficerObserverable officerObserverable) {
        this.officerObserverable = officerObserverable;
        this.officerObserverable.registerObserver(this);
    }

    @Override
    public void doCommand(String name, int priority) {
        Log.d(TAG, "name: "+name+" priority:"+priority);
    }
}
