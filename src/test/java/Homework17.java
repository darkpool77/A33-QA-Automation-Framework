<<<<<<< Updated upstream
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Homework17 extends BaseTest {

    WebDriver driver;



    @Test
    public static void addSongToThePlaylist() throws InterruptedException{
        BaseTest B = new BaseTest();

        B.setupBrowser();
        B.navigate("https://bbb.testpro.io/");

        B.enterEmail("valentineguts@gmail.com");
        B.enterPassword("te$t$tudent");
        B.submit();

        B.search("Holiznacc0");


        B.driver.quit();


=======
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.net.URL;

public class Homework17 extends BaseTest {

    @Test
    public static void addSongToPlaylist() {
        BaseTest B = new BaseTest();
        B.setupBrowser();
        B.Navigate("https://bbb.testpro.io/");


        Assert.assertEquals(B.driver.getCurrentUrl(), "https://bbb.testpro.io/");
>>>>>>> Stashed changes











    }







<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
}
