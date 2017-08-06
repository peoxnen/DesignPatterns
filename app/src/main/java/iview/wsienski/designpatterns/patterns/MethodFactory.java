package iview.wsienski.designpatterns.patterns;

import android.util.Log;

import iview.wsienski.designpatterns.Pattern;
import iview.wsienski.designpatterns.methodfactory.Army;
import iview.wsienski.designpatterns.methodfactory.Company;
import iview.wsienski.designpatterns.methodfactory.PolishArmy;
import iview.wsienski.designpatterns.methodfactory.RussianArmy;

/**
 * Created by Witold Sienski on 06.08.2017.
 */

public class MethodFactory extends Pattern {


    private static final String TAG = MethodFactory.class.getSimpleName();

    @Override
    public String getName() {
        return TAG;
    }

    public void run(){
        super.run();
        Army polishArmy = new PolishArmy();
        Army russianArmy = new RussianArmy();

        Company polishCavlryCompany =
                polishArmy.getCompany(Army.CAVLRY_TAG);

       Company russianInfantryCompany =
               russianArmy.getCompany(Army.INFANTRY_TAG);

        Log.d(TAG, "russianInfantryCompany (Calalry:"+russianInfantryCompany.getCalalryNumber()
                +" Infantry:"+russianInfantryCompany.getInfantryNumber() + ") vs "+
                "polishCavlryCompany (Calalry:"+polishCavlryCompany.getCalalryNumber()
                +" Infantry:"+polishCavlryCompany.getInfantryNumber()+")");
    }
}
