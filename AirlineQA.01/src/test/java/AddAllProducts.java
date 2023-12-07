import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class AddAllProducts extends Browserclass {
    @Parameters({"xpathButtons"})
    @Test
    public void adalprocducts(String xpathvalue) {
        List<WebElement> buttons = driver.findElements(By.xpath(xpathvalue));
        for (WebElement addbuttons : buttons) {
            String value = addbuttons.getText();
            System.out.println(value);
            addbuttons.click();
        }
    }
    @Parameters({"xpathButtons1"})
    @Test
    public void verifyingitemnos(String itemspriceXpath) {
        driver.manage().window().fullscreen();
        WebElement itemsprice = driver.findElement(By.xpath(itemspriceXpath));
        System.out.println(itemsprice.getText());
    }
@Parameters({"xpathButtons2","xpathButtons3"})
    @Test
    public void clickcart(String xpath2,String xpath3) {
        driver.findElement(By.xpath(xpath2)).click();
        List<WebElement> listallitems = driver.findElements(By.xpath(xpath3));
        for (WebElement allitems : listallitems) {
            String value1 = allitems.getText();
            System.out.println(value1);

        }
        driver.findElement(By.xpath("(//button[normalize-space()='PROCEED TO CHECKOUT'])[1]")).click();

    }

}

