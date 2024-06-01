package Z_10_screenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.api.internal.Utils;

public class me_02_practice {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://saucelabs.com/resources/blog/selenium-4-relative-locators");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File dest=new File("D:\\java programs\\SeleniumTraining\\src\\test\\java\\screenshot\\saucelab.jpg");
		
		
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, dest);
		System.out.println("screenshot taken");
		
		driver.quit();
		
		
	}

}
