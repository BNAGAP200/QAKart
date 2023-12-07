import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.Parameter;

public class Browserclass {
    protected static WebDriver driver;

    @Test(groups = "smoke")
    @Parameters({"URL"})
    public void setupbrowser(String urlqa) {
        driver = new EdgeDriver();
        driver.get(urlqa);
        Assert.assertEquals("GreenKart - veg and fruits kart", driver.getTitle());

    }

   /* @AfterSuite
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }*/
    }
