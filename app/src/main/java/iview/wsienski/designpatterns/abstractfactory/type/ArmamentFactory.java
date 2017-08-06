package iview.wsienski.designpatterns.abstractfactory.type;

import iview.wsienski.designpatterns.abstractfactory.armament.Armor;
import iview.wsienski.designpatterns.abstractfactory.armament.Lance;
import iview.wsienski.designpatterns.abstractfactory.armament.Horse;
import iview.wsienski.designpatterns.abstractfactory.armament.MeleeWeapon;

/**
 * Created by Witold Sienski on 06.08.2017.
 */

public interface ArmamentFactory {

    MeleeWeapon giveWeapon();
    Lance giveLance();
    Armor giveArmor();
    Horse giveHorse();
}
