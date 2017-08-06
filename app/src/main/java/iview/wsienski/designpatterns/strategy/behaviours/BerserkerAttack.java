package iview.wsienski.designpatterns.strategy.behaviours;

import android.util.Log;

/**
 * Created by Witold Sienski on 10.07.2016.
 */
public class BerserkerAttack implements IAttack {

    public static final String TAG = BerserkerAttack.class.getSimpleName();

    @Override
    public String attack() {
        String text = "berserker locate";
        Log.d(TAG, text);
        return text;
    }
}
