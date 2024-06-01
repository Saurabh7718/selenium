package Z_A_08_screenshots;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

public class selenium_grid {
	public static WebDriver driver;
	
	@BeforeSuite
	public void setup() throws MalformedURLException {

        ChromeOptions options = new ChromeOptions();
        
        
        try {
            driver = new RemoteWebDriver(new URI("http://localhost:4444").toURL(), options);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
	}
	
	@AfterSuite
	public void teardown() {
		driver.quit();
	}

}
