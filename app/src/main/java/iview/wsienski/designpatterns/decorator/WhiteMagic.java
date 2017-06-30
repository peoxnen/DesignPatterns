package iview.wsienski.designpatterns.decorator;

/**
 * Created by Witold Sienski on 30.06.2017.
 */

public class WhiteMagic extends EnchantDecorator {
    Enchant enchant;

    public WhiteMagic(Enchant enchant){
        this.enchant=enchant;
    }

    @Override
    public String getTitle() {
        return enchant.getTitle() + " White Magic";
    }

    @Override
    public int getStrength() {
        return enchant.getStrength()+50;
    }
}
