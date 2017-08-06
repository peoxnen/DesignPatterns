package iview.wsienski.designpatterns.abstractfactory.type;

import iview.wsienski.designpatterns.abstractfactory.armament.Armor;
import iview.wsienski.designpatterns.abstractfactory.armament.Axe;
import iview.wsienski.designpatterns.abstractfactory.armament.Halberd;
import iview.wsienski.designpatterns.abstractfactory.armament.Horse;
import iview.wsienski.designpatterns.abstractfactory.armament.Lance;
import iview.wsienski.designpatterns.abstractfactory.armament.RussianHorse;
import iview.wsienski.designpatterns.abstractfactory.armament.Shield;
import iview.wsienski.designpatterns.abstractfactory.armament.MeleeWeapon;

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
