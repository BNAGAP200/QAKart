import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ChooseSpecificProducts extends Browserclass{
@Test
    public void verifyingsingleproduct(){
    List<WebElement> allproducts =driver.findElements(By.xpath("//div[@class='products']//h4"));
    int desiredproduct =4;
    if (desiredproduct>= 0 && desiredproduct < allproducts.size()) {
        WebElement desiredProduct =allproducts.get(desiredproduct);
        desiredProduct.click();
    } else {
        System.out.println("Desired product index is out of bounds.");
    }
}
}


