package Run;

//import commonItems.provinceScreen1;
import commonItems.CommonIt;
import org.junit.Test;
import org.testng.annotations.BeforeMethod;
import pageObjects.*;

import java.io.IOException;

public class carQuote extends BaseClass {


    @Test
    public void getCarQuote() throws IOException, InterruptedException {
        launchApplication();
        CommonIt commonIt = new CommonIt(driver);
        commonIt.clickOnAcceptAll();
        commonIt.clickOnCarQuote();
        commonIt.clickOnGetACarQuote();
    provinceScreen1 PS1 = new provinceScreen1 (driver);
    PS1.clickOnProvinceUrl();
    PS1.selectProvinceDD("Ontario");
    PS1.selectVehicleYearDD("2024");
    PS1.selectVehicleMakeDD("HONDA");
    PS1.selectvehicleModelDD("CIVIC SPORT 4DR");
        commonIt.ClickOnNextButton();
    vehicleDetails2 VD2 = new vehicleDetails2(driver);
    VD2.selectVehicleConditionPurchased("New");
    VD2.selectVehicleOwnershipOption("Owned");
        commonIt.ClickOnNextButton();
    useVehicle3 UV3 = new useVehicle3(driver);
    UV3.selectMileageOption("0 to 5,000 km");
    UV3.commuteSchoolWork("No");
        commonIt.ClickOnNextButton();
        commonIt.ClickOnNextButton();
    SavingsAndDiscounts5 savingsAndDiscounts5 = new SavingsAndDiscounts5(driver);
    savingsAndDiscounts5.winterTyresDiscount("Yes");
    savingsAndDiscounts5.antiTheftTrackingDevice("No");
    savingsAndDiscounts5.selectAntiTheft30DaysOption("No");
}

}