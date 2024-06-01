package Z_18_selenium_grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class X_01_grid {
    
    public static WebDriver driver;

    public static void main(String[] args) throws MalformedURLException {
        // TODO Auto-generated method stub

        ChromeOptions options = new ChromeOptions();
        
        
        try {
            driver = new RemoteWebDriver(new URI("https://192.168.29.172:4444").toURL(), options);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

}
