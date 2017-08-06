package iview.wsienski.designpatterns.methodfactory;

import android.util.Log;

/**
 * Created by Witold Sienski on 06.08.2017.
 */

class RussianCavlryCompany extends Company {

    public RussianCavlryCompany() {
        formationName = "Russian Cavlry Company";
        infantryNumber = 0;
        calavryNumber = 500;
    }

    @Override
    public void armament() {
        Log.d("RussianCavlryCompany","Give Russian horses");
    }

}
