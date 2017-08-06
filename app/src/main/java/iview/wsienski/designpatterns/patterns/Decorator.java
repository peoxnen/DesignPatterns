package iview.wsienski.designpatterns.patterns;

import android.util.Log;

import iview.wsienski.designpatterns.Pattern;
import iview.wsienski.designpatterns.decorator.BerserkerEnchant;
import iview.wsienski.designpatterns.decorator.BlackMagic;
import iview.wsienski.designpatterns.decorator.Enchant;
import iview.wsienski.designpatterns.decorator.WhiteMagic;

/**
 * Created by Witold Sienski on 06.08.2017.
 */

public class Decorator extends Pattern {

    private static final String TAG = Decorator.class.getSimpleName();

    @Override
    public String getName() {
        return TAG;
    }

    @Override
    public void run() {
        super.run();
        Enchant enchant = new BerserkerEnchant();
        Enchant blackMagic = new BlackMagic(enchant);
        Enchant blackMagic2 = new BlackMagic(blackMagic);

        Enchant enchant2 = new BerserkerEnchant();
        Enchant whiteMagic = new WhiteMagic(enchant2);

        Log.d(TAG, "Enchant + 2xBlack Magic: "+blackMagic2.getTitle() + " strength="+blackMagic2.getStrength()+"\n");
        Log.d(TAG, "Enchant + White Magic: "+whiteMagic.getTitle() + " strength="+whiteMagic.getStrength()+"\n");
   }
}
