package pageObjects;

import commonItems.CommonIt;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    WebDriver driver;

    public LandingPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void applicationurl() {
        driver.get("https://www.tdinsurance.com/");
    }
}
