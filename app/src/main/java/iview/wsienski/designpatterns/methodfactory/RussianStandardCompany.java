package iview.wsienski.designpatterns.methodfactory;

import android.util.Log;

/**
 * Created by Witold Sienski on 06.08.2017.
 */

class RussianStandardCompany extends Company {

    public RussianStandardCompany() {
        formationName = "Russian Standard Company";
        infantryNumber = 30000;
        calavryNumber = 350;
    }

    @Override
    public void armament() {
        Log.d("RussianStandardCompany","Give Russian horses");
    }

}
