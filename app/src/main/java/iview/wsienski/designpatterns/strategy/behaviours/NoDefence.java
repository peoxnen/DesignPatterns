package iview.wsienski.designpatterns.strategy.behaviours;

import android.util.Log;

/**
 * Created by Witold Sienski on 10.07.2016.
 */
public class NoDefence implements IDefence {

    public static final String TAG = NoDefence.class.getSimpleName();

    @Override
    public String defence() {
        String text = "no defence";
        Log.d(TAG, "no defence");
        return text;
    }
}
