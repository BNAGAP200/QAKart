import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Loginsce {

        @Test
        public void verfiyreg(){
            WebDriver driver = new EdgeDriver();
            driver.get("");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().fullscreen();
            driver.findElement(By.xpath("//a[@id='header_login_signup']")).click();
            driver.findElement(By.id("getotp")).sendKeys("456485415641");
            driver.findElement(By.id("getOtpButton")).click();
            Alert alert = driver.switchTo().alert();

// Get the text of the alert
            String alertText = alert.getText();
            System.out.println(alertText);

// Accept the alert (click the "OK" button)
            alert.accept();

        }
    }
