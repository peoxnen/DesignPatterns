package iview.wsienski.designpatterns.abstractfactory.products;

/**
 * Created by Witold Sienski on 06.08.2017.
 */

public class Longsword extends MeleeWeapon {
    @Override
    public String getName() {
        return Longsword.class.getSimpleName();
    }
}
