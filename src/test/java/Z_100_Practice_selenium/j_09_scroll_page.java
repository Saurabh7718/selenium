package Z_100_Practice_selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class j_09_scroll_page {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get(" https://www.amazon.com");
		driver.manage().window().maximize();
		TakesScreenshot s = (TakesScreenshot) driver;

		File src = s.getScreenshotAs(OutputType.FILE);
		File trg = new File("C:\\Users\\91883\\Documents\\saurabh_code\\TESTING\\API TESTING");

		FileUtils.copyFile(src, trg);
	}

}
