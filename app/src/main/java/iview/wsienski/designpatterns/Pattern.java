package iview.wsienski.designpatterns;

import android.util.Log;

/**
 * Created by Witold Sienski on 06.08.2017.
 */

public abstract class Pattern {

    public void run(){
        Log.d(getName(), "--------------------------------"+getName()+"------------------------------");
    }

    public abstract String getName();
}
