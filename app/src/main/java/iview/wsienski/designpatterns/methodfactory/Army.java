package iview.wsienski.designpatterns.methodfactory;

/**
 * Created by Witold Sienski on 06.08.2017.
 */

public abstract class Army {

    public static final String INFANTRY_TAG = "INFANTRY_TAG";
    public static final String CAVLRY_TAG = "CAVLRY_TAG";
    public static final String STANDARD_TAG = "STANDARD_TAG";

    abstract Company createCompany(String type);

    public Company getCompany(String type){
        Company company;
        company = createCompany(type);
        company.armament();
        company.locate();
        return company;
    }

}
