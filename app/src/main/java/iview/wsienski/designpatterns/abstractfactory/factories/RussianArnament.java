package iview.wsienski.designpatterns.abstractfactory.factories;

import iview.wsienski.designpatterns.abstractfactory.products.Armor;
import iview.wsienski.designpatterns.abstractfactory.products.Axe;
import iview.wsienski.designpatterns.abstractfactory.products.Halberd;
import iview.wsienski.designpatterns.abstractfactory.products.Horse;
import iview.wsienski.designpatterns.abstractfactory.products.Lance;
import iview.wsienski.designpatterns.abstractfactory.products.RussianHorse;
import iview.wsienski.designpatterns.abstractfactory.products.Shield;
import iview.wsienski.designpatterns.abstractfactory.products.MeleeWeapon;

/**
 * Created by Witold Sienski on 06.08.2017.
 */

public class RussianArnament implements ArmamentFactory {

    @Override
    public MeleeWeapon giveWeapon() {
        return new Axe();
    }

    @Override
    public Lance giveLance() {
        return new Halberd();
    }

    @Override
    public Armor giveArmor() {
        return new Shield();
    }

    @Override
    public Horse giveHorse() {
        return new RussianHorse();
    }


}
