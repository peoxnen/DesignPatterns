package iview.wsienski.designpatterns.methodfactory;

import android.util.Log;

/**
 * Created by Witold Sienski on 06.08.2017.
 */

public class PolishCavlryCompany extends Company {

    public PolishCavlryCompany() {
        formationName = "Husaria";
        infantryNumber = 800;
        calavryNumber = 0;
    }

    @Override
    public void armament() {
        Log.d("PolishCavlryCompany","Give Polish horses");
    }
}
