package iview.wsienski.designpatterns.strategy.behaviours;

import android.util.Log;

/**
 * Created by Witold Sienski on 10.07.2016.
 */
public class DoubleAttack implements IAttack {

    public static final String TAG = DoubleAttack.class.getSimpleName();

    @Override
    public String attack() {
        String text = "double attack";
        Log.d(TAG, text);
        return text;
    }
}
