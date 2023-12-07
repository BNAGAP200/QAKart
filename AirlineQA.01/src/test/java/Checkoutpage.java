


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.nio.file.WatchEvent;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Checkoutpage extends Addcartpage {
    @BeforeTest
    public void verifypagetitle() {
        Assert.assertEquals("GreenKart - veg and fruits kart", driver.getTitle());
    }


    @Test
    public void verifyplaceorderbutton() {
        Wait<WebDriver> wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Place Order']"))).click();

        }
    }

