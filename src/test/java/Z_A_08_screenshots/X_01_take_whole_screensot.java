package Z_A_08_screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_01_take_whole_screensot extends selenium_grid {
	@Test
    public void testTakeScreenshot() throws IOException, InterruptedException {
        // Navigate to the desired URL
        driver.get("https://demo.automationtesting.in/Register.html");

        // Take the screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File des = new File("D:\\java programs\\SeleniumTraining\\src\\test\\java\\home.png");
        FileUtils.copyFile(src, des);
        
        Thread.sleep(15000);
    }

	}


