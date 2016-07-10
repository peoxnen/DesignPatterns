package iview.wsienski.designpatterns.strategy.behaviours;

import android.util.Log;


/**
 * Created by Witold Sienski on 10.07.2016.
 */
public class BlockDefence implements IDefence {

    public static final String TAG = BlockDefence.class.getSimpleName();

    @Override
    public String defence() {
        String text = "well blocked";
        Log.d(TAG, "well blocked");
        return text;
    }
}
