package iview.wsienski.designpatterns.decorator;

/**
 * Created by Witold Sienski on 30.06.2017.
 */

public abstract class Enchant {

    String title;

    public String getTitle(){
        return title;
    }

    public abstract int getStrength();
}
