package iview.wsienski.designpatterns.methodfactory;

/**
 * Created by Witold Sienski on 06.08.2017.
 */

public class PolishArmy extends Army {
    @Override
    Company createCompany(String type) {
        if(type.equals(Army.INFANTRY_TAG)){
            return new PolishInfantryCompany();
        } else if(type.equals(Army.CAVLRY_TAG)){
            return new PolishCavlryCompany();
        }
        return null;
    }
}
