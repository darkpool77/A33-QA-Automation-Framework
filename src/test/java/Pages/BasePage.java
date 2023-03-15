package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    public static WebDriver driver;
    public WebDriverWait wait;
    Actions actions;
    public BasePage(WebDriver givenDriver){
        driver = givenDriver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        actions = new Actions(driver);
    }
    public void doubleClick(WebElement Locator) {
        wait.until(ExpectedConditions.elementToBeClickable(Locator));
        actions.doubleClick(Locator).perform();
    }




}