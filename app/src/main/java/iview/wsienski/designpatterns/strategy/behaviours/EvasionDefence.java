package iview.wsienski.designpatterns.strategy.behaviours;

import android.util.Log;

/**
 * Created by Witold Sienski on 10.07.2016.
 */
public class EvasionDefence implements IDefence {

    public static final String TAG = EvasionDefence.class.getSimpleName();

    @Override
    public String defence() {
        String text = "evasion defence";
        Log.d(TAG, "evasion defence");
        return text;
    }
}
