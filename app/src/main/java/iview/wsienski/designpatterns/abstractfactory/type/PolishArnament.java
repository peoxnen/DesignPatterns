package iview.wsienski.designpatterns.abstractfactory.type;

import iview.wsienski.designpatterns.abstractfactory.armament.Armor;
import iview.wsienski.designpatterns.abstractfactory.armament.Horse;
import iview.wsienski.designpatterns.abstractfactory.armament.Lance;
import iview.wsienski.designpatterns.abstractfactory.armament.Longsword;
import iview.wsienski.designpatterns.abstractfactory.armament.PolishHorse;
import iview.wsienski.designpatterns.abstractfactory.armament.SilverArmor;
import iview.wsienski.designpatterns.abstractfactory.armament.LongLance;
import iview.wsienski.designpatterns.abstractfactory.armament.MeleeWeapon;

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
