package commonItems;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonIt {

   public WebDriver driver;

    public CommonIt(WebDriver driver) {
        //super();
        this.driver = driver;
        PageFactory.initElements (driver, this);
        //It helps instantiate the WebElements that you declare in the page class using annotations like
        //Without it, the @FindBy annotations won't work, and Selenium will not be able to interact with the elements.
    }

//    public void launchApplication() {
//        driver.get("https://www.tdinsurance.com/");
//    }

    @FindBy(id = "Bundle To Save")
    WebElement getQuote;

    public void clickOnGetQuote() {
        getQuote.click();
    }

    @FindBy(xpath = "//a[@data-di-id='di-id-84980060-9fcc43b7']")
    WebElement carQuote;

    public void clickOnCarQuote() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        WebElement visibleElement = wait.until(ExpectedConditions.elementToBeClickable(carQuote));
        visibleElement.click();
        //carQuote.click();
    }

    @FindBy(xpath = "//a[@data-di-id='di-id-fd6d863e-8c7400e4']")
    WebElement homeOrCondo;

    public void clickOnHomeOrCondo() {
        homeOrCondo.click();
    }

    @FindBy(xpath = "//a[@tabindex='-1' and @href='https://www.tdinsurance.com/products-services/tenant-insurance']")
    WebElement tenantInsurance;

    public void clickOnTenantInsurance() {
        tenantInsurance.click();
    }

    @FindBy(xpath = "//button[text()='Accept all']")
    WebElement acceptAll;

    public void clickOnAcceptAll() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement visibility = wait.until(ExpectedConditions.visibilityOf(acceptAll));
        visibility.click();
    }

    @FindBy(xpath = "//a[@tabindex='0' and @data-di-id='Get a car insurance quote']")
    WebElement getACarQuote;

    public void clickOnGetACarQuote() throws InterruptedException {
        implicitWait();
        getACarQuote.click();
    }

    public void implicitWait() throws InterruptedException {
        Thread.sleep(3000);
    }

    @FindBy(xpath = "//button[contains(@id,'quoterEngine.footerButton.next')]")
    WebElement nextButton;

    public void ClickOnNextButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2) );
        WebElement visibilityOfButton = wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        visibilityOfButton.click();
        //nextButton.click();
    }

    public void implicitWait2Sec() throws InterruptedException {
        Thread.sleep(2000);
    }

    public void implicitWait1Sec() throws InterruptedException {
        Thread.sleep(1000);
    }

}

