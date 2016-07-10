package iview.wsienski.designpatterns.strategy;

import android.util.Log;

import iview.wsienski.designpatterns.strategy.behaviours.IAttack;
import iview.wsienski.designpatterns.strategy.behaviours.IDefence;

/**
 * Created by Witold Sienski on 10.07.2016.
 */
public abstract class Warrior {

    public static final String TAG = Warrior.class.getSimpleName();
    IAttack iAttack;
    IDefence iDefence;

    public Warrior(){
        Log.d(TAG, "Warrior constructor");
    }

    public abstract String show();

    public void executeAttack(){
        iAttack.attack();
    }

    public void executeDefence(){
        iDefence.defence();
    }

    public void setIAttack(IAttack iAttack){
        this.iAttack=iAttack;
    }

    public void setiIDefence(IDefence iDefence){
        this.iDefence=iDefence;
    }

}
