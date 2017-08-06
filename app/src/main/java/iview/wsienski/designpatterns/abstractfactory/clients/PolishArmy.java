package iview.wsienski.designpatterns.abstractfactory.clients;

import android.util.Log;

import iview.wsienski.designpatterns.abstractfactory.company.CavlryCompany;
import iview.wsienski.designpatterns.abstractfactory.company.Company;
import iview.wsienski.designpatterns.abstractfactory.company.InfantryCompany;
import iview.wsienski.designpatterns.abstractfactory.factories.ArmamentFactory;
import iview.wsienski.designpatterns.abstractfactory.factories.PolishArnament;

/**
 * Created by Witold Sienski on 06.08.2017.
 */

public class PolishArmy extends Army {
    @Override
    protected Company createCompany(String type) {
        Company company = null;
        ArmamentFactory armamentFactory = new PolishArnament();
        Log.d("witek","PolishArmy type="+type);
        if(type.equals(Army.CAVLRY_TAG)){
            company = new CavlryCompany(armamentFactory);
        } else if(type.equals(Army.INFANTRY_TAG)){
            company = new InfantryCompany(armamentFactory);
        }

        return  company;
    }
}
