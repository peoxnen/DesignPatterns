package iview.wsienski.designpatterns.simplefactory;

/**
 * Created by Witold Sienski on 06.08.2017.
 */

public class Army {

    SimpleCompanyFactory factory;

    public Army(SimpleCompanyFactory factory) {
        this.factory = factory;
    }

    public Company getCompany(String type){
        Company company;
        company = factory.createCompany(type);
        company.armament();
        company.locate();
        return company;
    }
    


}
