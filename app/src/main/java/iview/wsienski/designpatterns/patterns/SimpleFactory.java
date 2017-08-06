package iview.wsienski.designpatterns.patterns;

import android.util.Log;

import iview.wsienski.designpatterns.Pattern;
import iview.wsienski.designpatterns.simplefactory.Army;
import iview.wsienski.designpatterns.simplefactory.Company;
import iview.wsienski.designpatterns.simplefactory.SimpleCompanyFactory;

/**
 * Created by Witold Sienski on 06.08.2017.
 */

public class SimpleFactory extends Pattern {

    private static final String TAG = SimpleFactory.class.getSimpleName();

    @Override
    public String getName() {
        return TAG;
    }

    @Override
    public void run() {
        super.run();
        Army army = new Army(new SimpleCompanyFactory());
        Company polishCompany = army.getCompany(SimpleCompanyFactory.INFANTRY_TAG);
        Company russianCompany = army.getCompany(SimpleCompanyFactory.CAVLRY_TAG);

        Log.d(TAG, "polishCompany (Calalry:"+polishCompany.getCalalryNumber()
                +" Infantry:"+polishCompany.getInfantryNumber() + ") vs "+
                "russianCompany (Calalry:"+russianCompany.getCalalryNumber()
                +" Infantry:"+russianCompany.getInfantryNumber()+")");
    }
}
