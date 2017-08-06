package iview.wsienski.designpatterns.strategy;

import android.util.Log;

import iview.wsienski.designpatterns.strategy.behaviours.BerserkerAttack;
import iview.wsienski.designpatterns.strategy.behaviours.NoDefence;

/**
 * Created by Witold Sienski on 10.07.2016.
 */
public class BerserkerWarrior extends Warrior{

    public static final String TAG = BerserkerWarrior.class.getSimpleName();

    public BerserkerWarrior(){
        iAttack = new BerserkerAttack();
        iDefence = new NoDefence();
    }
    @Override
    public String show() {
        String text = TAG+" battle : locate="+iAttack.attack()+" defence="+iDefence.defence();
        Log.d(TAG, text);
        return text;
    }
}
