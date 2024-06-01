package Z_A_P_14_action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_01_flipkart_home_furniture {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        try {
            driver.get("https://www.flipkart.com/?s_kwcid=AL!739!3!678876521201!e!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gad_source=1&gclid=Cj0KCQjwwMqvBhCtARIsAIXsZpbSjhdefL01bXPgjOWD02KE3hnVSTjFbFf-57Z1dvF1ta1Sxrnf1_gaAjX-EALw_wcB");

            // Wait for the home and furniture element to be visible
            WebElement homeAndFurniture = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Home & Furniture')]")));

             
            
            // Perform the actions
            Actions act = new Actions(driver);
            act.moveToElement(homeAndFurniture).click().build().perform();

            // Wait for the tool and utility link to be clickable
             WebElement toolAndUtility = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Tools and Utilities')]")));
            act.moveToElement(toolAndUtility).click().build().perform();

            // Wait for the power tools link to be clickable
            WebElement powerTools = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Power Tools')]")));
            powerTools.click();

            System.out.println("Successfully navigated to Power Tools category.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
