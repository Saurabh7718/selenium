package Z_19_shadow_dom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_01_shadow_dom {

    public static void main(String[] args) throws InterruptedException {
        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();

        
        // Create ChromeDriver with Experimental Options
        WebDriver driver = new ChromeDriver();

        try {
            // Maximize the window
            driver.manage().window().maximize();

            // Navigate to Chrome Settings Appearance page
            driver.get("chrome://settings/appearance");

            // Find the root shadow host element
            WebElement settingsUi = driver.findElement(By.tagName("settings-ui"));

            // Access the shadow root of the first-level shadow host element
            WebElement settingsMain = (WebElement) ((RemoteWebDriver) driver).executeScript("return arguments[0].shadowRoot", settingsUi);

            // Access the shadow root of the second-level shadow host element
            WebElement settingsBasicPage = settingsMain.findElement(By.cssSelector("settings-main#main"))
                    .findElement(By.cssSelector("settings-basic-page.cr-centered-card-container"));
            WebElement appearancePage = (WebElement) ((RemoteWebDriver) driver).executeScript("return arguments[0].shadowRoot", settingsBasicPage);

            // Access the desired element within the Shadow DOM
            WebElement element = appearancePage.findElement(By.tagName("settings-appearance-page")).getShadowRoot()
            		.findElement(By.cssSelector("settings-toggle-button[label='Show home button']")).getShadowRoot()
            		.findElement(By.cssSelector("cr-toggle#control"));
            
            element.click();
            Thread.sleep(4000);

            // Print the text of the element
            System.out.println(element.getText());
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
