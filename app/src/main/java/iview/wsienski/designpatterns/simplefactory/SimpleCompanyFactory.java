package iview.wsienski.designpatterns.simplefactory;

/**
 * Created by Witold Sienski on 06.08.2017.
 */

public class SimpleCompanyFactory {

    public static final String INFANTRY_TAG = "INFANTRY_TAG";
    public static final String CAVLRY_TAG = "CAVLRY_TAG";
    public static final String STANDARD_TAG = "STANDARD_TAG";

    public Company createCompany(String type) {
        Company company = null;

        if(type.equals(INFANTRY_TAG)){
            company = new InfantryCompany();
        } else if(type.equals(CAVLRY_TAG)){
            company = new CalavryCompany();
        } else if(type.equals(STANDARD_TAG)){
            company = new FullCompany();
        }
        return company;
    }
}
