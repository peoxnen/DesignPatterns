package iview.wsienski.designpatterns;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import iview.wsienski.designpatterns.patterns.AbstractFactory;
import iview.wsienski.designpatterns.patterns.Decorator;
import iview.wsienski.designpatterns.patterns.MethodFactory;
import iview.wsienski.designpatterns.patterns.Observer;
import iview.wsienski.designpatterns.patterns.SimpleFactory;
import iview.wsienski.designpatterns.patterns.Strategy;

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
        runPattern(new Strategy());
        runPattern(new Observer());
        runPattern(new Decorator());
        runPattern(new SimpleFactory());
        runPattern(new MethodFactory());
        runPattern(new AbstractFactory());
    }

    private void runPattern(Pattern pattern) {
        pattern.run();
    }
}
