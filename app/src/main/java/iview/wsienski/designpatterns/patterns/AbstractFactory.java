package iview.wsienski.designpatterns.patterns;

import iview.wsienski.designpatterns.Pattern;
import iview.wsienski.designpatterns.abstractfactory.clients.Army;
import iview.wsienski.designpatterns.abstractfactory.clients.PolishArmy;
import iview.wsienski.designpatterns.abstractfactory.clients.RussianArmy;

/**
 * Created by Witold Sienski on 06.08.2017.
 */

public class AbstractFactory extends Pattern{

    private static final String TAG = AbstractFactory.class.getSimpleName();

    @Override
    public String getName() {
        return TAG;
    }

    @Override
    public void run() {
        super.run();
        PolishArmy polishArmy = new PolishArmy();
        polishArmy.getCompany(Army.CAVLRY_TAG);
        polishArmy.getCompany(Army.INFANTRY_TAG);

        RussianArmy russianArmy = new RussianArmy();
        russianArmy.getCompany(Army.CAVLRY_TAG);
        russianArmy.getCompany(Army.INFANTRY_TAG);
    }
}
