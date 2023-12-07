
    import jdk.jfr.Enabled;
    import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.edge.EdgeDriver;
    import org.testng.Assert;
    import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

    import javax.xml.stream.events.Attribute;
    import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

    public class TableSortingTest {

        private WebDriver driver;

        @BeforeClass
        public void setUp() {
            // Set up WebDriver (Assuming you have the ChromeDriver executable in your path)
            driver = new EdgeDriver();
            // Navigate to the "https://rahulshettyacademy.com/seleniumPractise/#/offers" page
            driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        }

        @Test
        public void testTableSortingByPrice() {
            // Get the table rows//tbody//tr
            driver.findElement(By.xpath("//option[@value='20']")).click();

            List<WebElement> rows = driver.findElements(By.cssSelector("table.table tbody tr"));
            List<String> takeoffrows  =rows.stream().map(row->row.findElement(By.xpath(".//td[2]")).getText())
                            .collect(Collectors.toList());
            List<String> sorteddatbypriice = takeoffrows.stream().sorted(Comparator.comparingDouble(Double::parseDouble))
                    .collect(Collectors.toList());

        }


        @Test(enabled = false)
        public void testTableSortingAlphabetically() {
            driver.findElement(By.xpath("//option[@value='20']")).click();
            // Get the table rows
            List<WebElement> rows = driver.findElements(By.cssSelector("table.table tbody tr"));

            // Extract data from each row and store it in a list
            List<String> rowData = rows.stream()
                    .map(row -> row.findElement(By.xpath(".//td[1]")).getText())
                    .collect(Collectors.toList());

            // Sort the data alphabetically
            List<String> sortedDataAlphabetically = rowData.stream()
                    .sorted()
                    .collect(Collectors.toList());

            // Print the sorted data alphabetically
            System.out.println("\nSorted Data Alphabetically:");
            sortedDataAlphabetically.forEach(System.out::println);

        }

    }


