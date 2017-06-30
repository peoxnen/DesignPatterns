package iview.wsienski.designpatterns.decorator;

/**
 * Created by Witold Sienski on 30.06.2017.
 */

public class BerserkerEnchant extends Enchant {

    public BerserkerEnchant() {
        title = "Berserker enchant";
    }

    @Override
    public int getStrength() {
        return 100;
    }
}
