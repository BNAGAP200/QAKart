import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.List;

public class productListing extends Browserclass {

    @Test(groups ="smoke")
    public void verifylistofTproducts() {
        WebElement space1 = driver.findElement(By.xpath("//input[@placeholder='Search for Vegetables and Fruits']"));
        /*space1.sendKeys("c");
      List<WebElement> products1=driver.findElements(By.xpath("//div[@class='products']//h4"));
      int productssize1= products1.size();
        System.out.println(productssize1);*/

//let me take the brocooli and explore the items
        space1.sendKeys("Brocolli");
        System.out.println(driver.findElement(By.xpath("//p[@class='product-price']")).getText());
        WebElement increaseButton = driver.findElement(By.xpath("//a[normalize-space()='+']"));
        WebElement decreaseButton = driver.findElement(By.xpath("//a[normalize-space()='–']"));
        System.out.println(driver.findElement(By.xpath("//div[@class='product-action']")).getText());
        WebElement quantityinput = driver.findElement(By.xpath("//input[@class='quantity']"));

        int DesiredQuantity = 100;

        int currentquantity = Integer.parseInt(quantityinput.getAttribute("value"));

        while (currentquantity < DesiredQuantity) {
            increaseButton.click();
            currentquantity = Integer.parseInt(quantityinput.getAttribute("value"));
        }
        System.out.println(currentquantity);
        WebElement button = driver.findElement(By.xpath("//button[normalize-space()='ADD TO CART']"));

    }

}

