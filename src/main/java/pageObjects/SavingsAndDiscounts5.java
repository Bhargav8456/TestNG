package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SavingsAndDiscounts5 {
    public WebDriver driver;

    public SavingsAndDiscounts5(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void winterTyresDiscount (String selectOption){
        if ("Yes".equalsIgnoreCase(selectOption)){
            WebElement yesSelection = driver.findElement(By.xpath("//button[@id='quoterEngine.question.winterTiresQuestion.true']"));
            yesSelection.click();
        } else if ("No".equalsIgnoreCase(selectOption)) {
            WebElement noSelection = driver.findElement(By.xpath("//button[@id='quoterEngine.question.winterTiresQuestion.false']"));
            noSelection.click();
        }
        else {
            System.out.println("Invalid Option");
        }
    }

    public void antiTheftTrackingDevice (String selectOption){
        if ("Yes".equalsIgnoreCase(selectOption)){
            WebElement yesOption = driver.findElement(By.xpath("//button[@id='quoterEngine.question.antiTheftQuestion.true']"));
            yesOption.click();
        }
        else if ("No".equalsIgnoreCase(selectOption)) {
            WebElement noOption = driver.findElement(By.xpath("//button[@id='quoterEngine.question.antiTheftQuestion.false']"));
            noOption.click();
        }
        else {
            System.out.println("Invalid Option");
        }

    }

    public boolean selectAntiTheft30DaysOption(String option) {

        if (isElementPresent(By.xpath("//button[@id='quoterEngine.question.antiTheft30DaysQuestion.true']"))) {
            if ("Yes".equalsIgnoreCase(option)) {
                WebElement yesOption = driver.findElement(By.xpath("//button[@id='quoterEngine.question.antiTheft30DaysQuestion.true']"));
                yesOption.click();
            } else if ("No".equalsIgnoreCase(option)) {
                WebElement noOption = driver.findElement(By.xpath("//button[@id='quoterEngine.question.antiTheft30DaysQuestion.false']"));
                noOption.click();
            } else {
                System.out.println("Invalid option. Please select either 'Yes' or 'No'.");
            }
        }
        return false;
    }
    public boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
}}

