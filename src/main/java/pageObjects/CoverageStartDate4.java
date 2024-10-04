package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CoverageStartDate4 {

    public WebDriver driver;

    public void CoverageStartDate4 (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


}
