package iview.wsienski.designpatterns.abstractfactory.armament;

/**
 * Created by Witold Sienski on 06.08.2017.
 */

public class Shield extends Armor {
    @Override
    public String getName() {
        return Shield.class.getSimpleName();
    }
}
