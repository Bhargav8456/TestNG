package pageObjects;

import commonItems.CommonIt;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class vehicleDetails2 extends CommonIt {

    public WebDriver driver;

   public vehicleDetails2 (WebDriver driver){
       super(driver);
       this.driver = driver;
       PageFactory.initElements(driver, this);
   }

    //@FindBy (xpath = "//button[@id='quoterEngine.question.carCondition.\" + condition.toLowerCase() + \"']")
//    WebElement vehicleConditionPurchased;

    public void selectVehicleConditionPurchased (String condition) {
        String Xpath = "//button[@id='quoterEngine.question.carCondition." + condition.toLowerCase() + "']";
        WebElement SSOption = driver.findElement(By.xpath(Xpath));
        SSOption.click();
    }

    public void selectVehicleOwnershipOption(String ownershipType) {
        String Xpath = "//button[@id='quoterEngine.question.ownedOrLeased." + ownershipType.toLowerCase() + "']";
        WebElement ownershipOption = driver.findElement(By.xpath(Xpath));
        ownershipOption.click();
    }

}
