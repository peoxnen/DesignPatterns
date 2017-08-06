package iview.wsienski.designpatterns.strategy;

import android.util.Log;

import iview.wsienski.designpatterns.strategy.behaviours.BlockDefence;
import iview.wsienski.designpatterns.strategy.behaviours.DoubleAttack;

/**
 * Created by Witold Sienski on 10.07.2016.
 */
public class ShieldBearerWarrior extends Warrior{

    public static final String TAG = ShieldBearerWarrior.class.getSimpleName();

    public ShieldBearerWarrior(){
        iAttack = new DoubleAttack();
        iDefence = new BlockDefence();
    }
    @Override
    public String show() {
        String text = TAG+" battle : locate="+iAttack.attack()+" defence="+iDefence.defence();
        Log.d(TAG, text);
        return text;
    }
}
