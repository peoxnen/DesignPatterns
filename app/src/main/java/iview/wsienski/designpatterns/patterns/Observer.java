package iview.wsienski.designpatterns.patterns;

import iview.wsienski.designpatterns.Pattern;
import iview.wsienski.designpatterns.observer.AxemanObserver;
import iview.wsienski.designpatterns.observer.Officer;
import iview.wsienski.designpatterns.observer.SoldierObserver;

/**
 * Created by Witold Sienski on 06.08.2017.
 */

public class Observer extends Pattern {

    private static final String TAG = Observer.class.getSimpleName();

    @Override
    public String getName() {
        return TAG;
    }

    @Override
    public void run() {
        super.run();
        Officer officer = new Officer();
        AxemanObserver axemanObserver = new AxemanObserver(officer);
        SoldierObserver soldierObserver = new SoldierObserver(officer);
        officer.giveCommand("Attack!",10);
    }
}
