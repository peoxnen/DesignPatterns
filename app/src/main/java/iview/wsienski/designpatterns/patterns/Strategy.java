package iview.wsienski.designpatterns.patterns;

import android.util.Log;

import iview.wsienski.designpatterns.Pattern;
import iview.wsienski.designpatterns.strategy.BerserkerWarrior;
import iview.wsienski.designpatterns.strategy.NinjaWarrior;
import iview.wsienski.designpatterns.strategy.ShieldBearerWarrior;
import iview.wsienski.designpatterns.strategy.behaviours.NoDefence;

/**
 * Created by Witold Sienski on 06.08.2017.
 */

public class Strategy extends Pattern {
    private static final String TAG = Strategy.class.getSimpleName();

    @Override
    public String getName() {
        return TAG;
    }

    @Override
    public void run() {
        super.run();
        NinjaWarrior ninjaWarrior = new NinjaWarrior();
        Log.d(TAG, ninjaWarrior.show()+"\n");
        BerserkerWarrior berserkerWarrior = new BerserkerWarrior();
        Log.d(TAG, berserkerWarrior.show()+"\n");
        ShieldBearerWarrior shieldBearerWarrior = new ShieldBearerWarrior();
        Log.d(TAG, shieldBearerWarrior.show()+"\n");
        shieldBearerWarrior.setiIDefence(new NoDefence());
        Log.d(TAG, shieldBearerWarrior.show()+"\n");
    }
}
