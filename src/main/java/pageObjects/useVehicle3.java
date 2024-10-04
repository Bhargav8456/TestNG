package pageObjects;

import commonItems.CommonIt;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class useVehicle3 extends CommonIt {
    public WebDriver driver;

    public useVehicle3 (WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectMileageOption(String mileageRange) {
        WebElement mileageOption = driver.findElement(By.xpath("//input[@aria-label='" + mileageRange + "']"));
        mileageOption.click();
    }

    public void commuteSchoolWork (String chooseOption) {
        if ("Yes".equalsIgnoreCase(chooseOption)) {
            WebElement yesButton = driver.findElement(By.id("quoterEngine.question.vehicleUseCommute.true"));
            yesButton.click();
            oneWayDriveDistance("1 to 5 km");
        } else if ("No".equalsIgnoreCase(chooseOption)) {
            WebElement noButton = driver.findElement(By.id("quoterEngine.question.vehicleUseCommute.false"));
            noButton.click();
        } else {
            System.out.println("Invalid option");
        }
    }

    public void oneWayDriveDistance(String mileageRange) {
        WebElement OWDD = driver.findElement(By.xpath("//input[@aria-label='" + mileageRange + "']"));
        OWDD.click();
    }


    }

