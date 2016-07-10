package iview.wsienski.designpatterns.strategy.behaviours;

import android.util.Log;

/**
 * Created by Witold Sienski on 10.07.2016.
 */
public class MissedAttack implements IAttack {

    public static final String TAG = MissedAttack.class.getSimpleName();

    @Override
    public String attack() {
        String text = "attack attack";
        Log.d(TAG, text);
        return text;
    }
}
