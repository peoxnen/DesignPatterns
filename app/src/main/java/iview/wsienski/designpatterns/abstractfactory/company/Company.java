package iview.wsienski.designpatterns.abstractfactory.company;

import android.util.Log;

import iview.wsienski.designpatterns.abstractfactory.armament.Armor;
import iview.wsienski.designpatterns.abstractfactory.armament.Horse;
import iview.wsienski.designpatterns.abstractfactory.armament.MeleeWeapon;

/**
 * Created by Witold Sienski on 06.08.2017.
 */

public abstract class Company {

    private static final String TAG = Company.class.getSimpleName();
    MeleeWeapon waapon;
    Armor armor;
    Horse horse;

    public abstract void prepareArmament();

    public void locate(){
        Log.d(TAG, "locate");
    }
}
