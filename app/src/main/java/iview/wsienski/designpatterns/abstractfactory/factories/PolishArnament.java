package iview.wsienski.designpatterns.abstractfactory.factories;

import iview.wsienski.designpatterns.abstractfactory.products.Armor;
import iview.wsienski.designpatterns.abstractfactory.products.Horse;
import iview.wsienski.designpatterns.abstractfactory.products.Lance;
import iview.wsienski.designpatterns.abstractfactory.products.Longsword;
import iview.wsienski.designpatterns.abstractfactory.products.PolishHorse;
import iview.wsienski.designpatterns.abstractfactory.products.SilverArmor;
import iview.wsienski.designpatterns.abstractfactory.products.LongLance;
import iview.wsienski.designpatterns.abstractfactory.products.MeleeWeapon;

/**
 * Created by Witold Sienski on 06.08.2017.
 */

public class PolishArnament implements ArmamentFactory {

    @Override
    public MeleeWeapon giveWeapon() {
        return new Longsword();
    }

    @Override
    public Lance giveLance() {
        return new LongLance();
    }

    @Override
    public Armor giveArmor() {
        return new SilverArmor();
    }

    @Override
    public Horse giveHorse() {
        return new PolishHorse();
    }
}
