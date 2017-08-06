package iview.wsienski.designpatterns.abstractfactory.factories;

import iview.wsienski.designpatterns.abstractfactory.products.Armor;
import iview.wsienski.designpatterns.abstractfactory.products.Lance;
import iview.wsienski.designpatterns.abstractfactory.products.Horse;
import iview.wsienski.designpatterns.abstractfactory.products.MeleeWeapon;

/**
 * Created by Witold Sienski on 06.08.2017.
 */

public interface ArmamentFactory {

    MeleeWeapon giveWeapon();
    Lance giveLance();
    Armor giveArmor();
    Horse giveHorse();
}
