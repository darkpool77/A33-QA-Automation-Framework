import io.github.bonigarcia.wdm.WebDriverManager;
<<<<<<< Updated upstream
import org.openqa.selenium.By;
=======
import org.checkerframework.checker.units.qual.C;
>>>>>>> Stashed changes
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
<<<<<<< Updated upstream
import org.openqa.selenium.support.ui.WebDriverWait;
=======
>>>>>>> Stashed changes
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;
<<<<<<< Updated upstream
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;

public class BaseTest {
   public static WebDriver driver = null;
   public static WebDriverWait wait = null;







=======


public class BaseTest {
    WebDriver driver = new ChromeDriver();
>>>>>>> Stashed changes

    @BeforeSuite
    static void setupClass() {
        WebDriverManager.chromedriver().setup();


    }
    @BeforeMethod
    static void setup() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(4));
    }

<<<<<<< Updated upstream


    public void setupBrowser(){
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void navigate(String setURL){
        driver.get(setURL);
    }

    public void enterEmail(String email) {
        WebElement EmailField = driver.findElement(By.cssSelector("[type='email']"));
        EmailField.sendKeys(email);


    }
    public void enterPassword(String passcode){
        WebElement PasscodeField = driver.findElement(By.cssSelector("[type='password']"));
        PasscodeField.sendKeys(passcode);
    }

    public void submit() {
        WebElement submitLogin = driver.findElement(By.cssSelector("[type='submit']"));
        submitLogin.click();
    }


    public void search(String songName) {
        WebElement searchField = driver.findElement(By.xpath("//input[@type='search']"));
        searchField.sendKeys(songName);

=======
    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }


    public void setupBrowser() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void Navigate (String URL) {
        driver.get(URL);
>>>>>>> Stashed changes
    }




<<<<<<< Updated upstream
=======


>>>>>>> Stashed changes
}
