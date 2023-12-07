import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class TopDealsVerify extends Browserclass {



    @Test
    public void verifytopdeals() {
        driver.findElement(By.xpath("//a[normalize-space()='Top Deals']")).click();
        Assert.assertEquals("GreenKart - veg and fruits kart",driver.getTitle());


        WebElement logo = driver.findElement(By.xpath("//div[@class='brand greenLogo']//div[@class='brand greenLogo']"));
        System.out.println(logo.getText());




    }

}