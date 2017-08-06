package iview.wsienski.designpatterns.simplefactory;

import android.util.Log;

/**
 * Created by Witold Sienski on 06.08.2017.
 */
public abstract class Company {

    final static String TAG = Company.class.getSimpleName();

    String formationName;
    int infantryNumber;
    int calavryNumber;

    public int getInfantryNumber() {
        return infantryNumber;
    }

    public String getFormationName() {
        return formationName;
    }

    public int getCalalryNumber() {
        return calavryNumber;
    }

    public void locate(){
        Log.d(TAG, "locate");
    }

    public void armament(){
        Log.d(TAG, "armament");
    }
}
