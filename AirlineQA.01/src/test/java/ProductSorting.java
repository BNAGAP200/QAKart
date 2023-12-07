import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class ProductSorting {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up WebDriver (Assuming you have the ChromeDriver executable in your path)
        driver = new ChromeDriver();
        // Navigate to the website
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
    }

    @Test
    public void sortProductsAlphabetically() {
        driver.findElement(By.xpath("//option[@value='20']")).click();
        List<WebElement> tablebody = driver.findElements(By.xpath("//table[@class='table table-bordered']//tbody//tr"));
if (tablebody.contains("Cheese")){
    System.out.println("The product is there");
}else{
    System.out.println("its not there");
}

    }
}