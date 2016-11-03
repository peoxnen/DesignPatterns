package iview.wsienski.designpatterns;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import iview.wsienski.designpatterns.observer.AxemanObserver;
import iview.wsienski.designpatterns.observer.Officer;
import iview.wsienski.designpatterns.observer.SoldierObserver;
import iview.wsienski.designpatterns.strategy.BerserkerWarrior;
import iview.wsienski.designpatterns.strategy.NinjaWarrior;
import iview.wsienski.designpatterns.strategy.ShieldBearerWarrior;
import iview.wsienski.designpatterns.strategy.behaviours.NoDefence;

public class MainActivity extends AppCompatActivity {

    final static String TAG = MainActivity.class.getSimpleName();

    @BindView(R.id.textview)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        strategy();
        observer();
    }

    private void observer() {
        Officer officer = new Officer();
        AxemanObserver axemanObserver = new AxemanObserver(officer);
        SoldierObserver soldierObserver = new SoldierObserver(officer);
        officer.giveCommand("Attack!",10);
    }

    private void strategy() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getString(R.string.pattern_strategy_title)+"\n");
        NinjaWarrior ninjaWarrior = new NinjaWarrior();
        stringBuilder.append(ninjaWarrior.show()+"\n");
        BerserkerWarrior berserkerWarrior = new BerserkerWarrior();
        stringBuilder.append(berserkerWarrior.show()+"\n");
        ShieldBearerWarrior shieldBearerWarrior = new ShieldBearerWarrior();
        stringBuilder.append(shieldBearerWarrior.show()+"\n");
        shieldBearerWarrior.setiIDefence(new NoDefence());
        stringBuilder.append(shieldBearerWarrior.show()+"\n");
        Log.d(TAG, stringBuilder.toString());
        textView.setText(stringBuilder);
    }
}
