package iview.wsienski.designpatterns.abstractfactory.company;

import android.util.Log;

import iview.wsienski.designpatterns.abstractfactory.type.ArmamentFactory;

/**
 * Created by Witold Sienski on 06.08.2017.
 */

public class InfantryCompany extends Company {

    ArmamentFactory armament;

    public InfantryCompany(ArmamentFactory armament) {
        this.armament = armament;
    }

    @Override
    public void prepareArmament() {
        waapon = armament.giveWeapon();
        armor = armament.giveArmor();
        Log.d("InfantryCompany", waapon.getName()+" "+armor.getName());
    }
}
