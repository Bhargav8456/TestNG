package pageObjects;

import commonItems.CommonIt;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class provinceScreen1 extends CommonIt {

    WebDriver driver;

    public provinceScreen1 (WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(@id,'changeQuoterProvince')]")
    WebElement provinceUrl;

    public void clickOnProvinceUrl () throws InterruptedException {
        implicitWait2Sec();
        provinceUrl.click();
    }

    @FindBy (xpath = "//select[contains(@aria-labelledby,'quoterEngine.question.quotersProvinceList-title-label undefined')]")
    WebElement provinceDD;

    public void selectProvinceDD (String provinceName){
        Select DropDown = new Select(provinceDD);
        DropDown.selectByVisibleText(provinceName);
    }

    @FindBy (id = "quoterEngine.question.carYear.button")
    WebElement vehicleYearDD;

    public void selectVehicleYearDD (String vehicleYear) throws InterruptedException {
        implicitWait2Sec();
        Select DD = new Select(vehicleYearDD);
        DD.selectByVisibleText(vehicleYear);
    }

    @FindBy (id = "quoterEngine.question.carMake.button")
    WebElement vehicleMakeDD;

    public void selectVehicleMakeDD (String vehicleMake) throws InterruptedException {
        implicitWait2Sec();
        Select DD = new Select(vehicleMakeDD);
        DD.selectByVisibleText(vehicleMake);
    }

    @FindBy (id = "quoterEngine.question.carModel.button")
    WebElement vehicleModelDD;

    public void selectvehicleModelDD (String vehicleModel) throws InterruptedException {
        implicitWait2Sec();
        Select DD = new Select(vehicleModelDD);
        DD.selectByVisibleText(vehicleModel);
    }

}