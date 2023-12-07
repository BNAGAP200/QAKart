import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import java.util.List;

public class Verifysearchtab extends Browserclass {


    @BeforeTest(groups = "smoke")
    public void searchtabverfiy() {
        WebElement search = driver.findElement(By.xpath("//div[@class='search']"));
        System.out.println(search.isDisplayed());


    }

    @Test(groups = "smoke")
    public void verfiysearchicon() {
        WebElement icon = driver.findElement(By.xpath("//button[@type='submit']"));
        System.out.println(icon.isDisplayed());

    }

    @AfterTest(groups = "regression")
    public void verfiysearchspace() {
        WebElement space = driver.findElement(By.xpath("//input[@placeholder='Search for Vegetables and Fruits']"));
        String watermark = space.getText();
        System.out.println(watermark);
        space.sendKeys("T");
        List<WebElement> products = driver.findElements(By.xpath("//div[@class='products']//img"));
        System.out.println(products.size());
        //I WOULD LIKE TO GET ALL THE ATTRIBUTES NAME WHICH COMES UNDER THESE X PATH
        for (int i = 0; i < products.size(); i++) {
            String attributeValue = products.get(i).getAttribute("alt");
            System.out.println(attributeValue);


        }

    }
}





