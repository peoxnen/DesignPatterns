package iview.wsienski.designpatterns.decorator;

/**
 * Created by Witold Sienski on 30.06.2017.
 */

public class BlackMagic extends EnchantDecorator {
    Enchant enchant;

    public BlackMagic(Enchant enchant) {
        this.enchant = enchant;
    }

    @Override
    public String getTitle() {
        return enchant.getTitle() + " Black Magic";
    }

    @Override
    public int getStrength() {
        return enchant.getStrength() + 100;
    }
}
