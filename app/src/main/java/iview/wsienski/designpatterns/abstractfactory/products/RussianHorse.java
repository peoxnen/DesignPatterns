package iview.wsienski.designpatterns.abstractfactory.products;

/**
 * Created by Witold Sienski on 06.08.2017.
 */

public class RussianHorse extends Horse {
    @Override
    public String getName() {
        return RussianHorse.class.getSimpleName();
    }
}
