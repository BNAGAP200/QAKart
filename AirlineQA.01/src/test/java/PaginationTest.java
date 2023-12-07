import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
public class PaginationTest {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
    }

    @Test
    public void mainopn() {
        List<String> price = new ArrayList<>();
        int currentPage = 0;
        int maxPagesToCheck = 5; // Set the maximum number of pages to check

        do {
            List<WebElement> capture = driver.findElements(By.xpath("//table[@class='table table-bordered']//tbody//tr"));
            List<String> rows = new ArrayList<>();

            for (WebElement element : capture) {
                rows.add(element.getText());
            }

            System.out.println(rows);
            List<String> sortedList = new ArrayList<>(rows);
            Collections.sort(sortedList);
            System.out.println(sortedList);

            List<WebElement> rows1 = driver.findElements(By.xpath("//tbody//td[2]"));

            for (WebElement element : rows1) {
                if (element.getText().contains("Rice")) {
                    System.out.println("The system is okay");
                } else {
                    driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
                }
            }
        }
    }
}
*/
