package iview.wsienski.designpatterns.abstractfactory.company;

import android.util.Log;

import iview.wsienski.designpatterns.abstractfactory.type.ArmamentFactory;

/**
 * Created by Witold Sienski on 06.08.2017.
 */

public class CavlryCompany extends Company {

    ArmamentFactory armament;

    public CavlryCompany(ArmamentFactory armament) {
        this.armament = armament;
    }

    @Override
    public void prepareArmament() {
        waapon = armament.giveWeapon();
        armor = armament.giveArmor();
        horse = armament.giveHorse();
        Log.d("CavlryCompany", waapon.getName()+" "+armor.getName()+" "+horse.getName());
    }
}
