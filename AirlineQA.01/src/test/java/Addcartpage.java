import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Addcartpage extends Browserclass {
    @BeforeTest
    public void addproducttocart(){
        driver.findElement(By.xpath("(//button[normalize-space()='ADD TO CART'])[1]")).click();
    }
    @Test
    public void clickcartbutton(){
        driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
        System.out.println(driver.findElement(By.xpath("(//img[@class='product-image'])[1]")).getAttribute("src"));
    }
    @AfterTest
    public void clickcheckout(){
        driver.findElement(By.xpath("(//button[normalize-space()='PROCEED TO CHECKOUT'])[1]")).click();
        System.out.println(driver.getTitle());

    }
}






