package Z_A_07_p_webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.List;

public class X_02_webtable_handle {
    public static void main(String[] args) {
        // Setting up Chrome WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to the webpage
        driver.get("https://cosmocode.io/automation-practice-webtable/");
        
      

        // Wait for the covering element to disappear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("aswift_4_host")));

        // Click on the checkbox
        WebElement checkbox = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/input[@class='hasVisited']"));
        checkbox.click();

        // Check if checkbox is selected
        boolean isSelected = checkbox.isSelected();
        System.out.println("Checkbox is selected: " + isSelected);

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        
        //print all titles of table
        List<WebElement> title=driver.findElements(By.xpath("//*[@id=\"countries\"]/tbody/tr[1]/td"));
		for(WebElement e: title) {
			String s=e.getText();
			System.out.println(s);
		}
        
        
        // Close the browser
        driver.quit();
    }
}
