package Z_A_08_screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_03_element_screenshot  extends selenium_grid {
@Test
	public static void testTakeScreenshot()throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
//		WebDriverManager.chromedriver().setup();
//		
//		ChromeDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Charts.html");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		WebElement element=driver.findElement(By.xpath("//h2[normalize-space()='62%']"));
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=element.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("D:\\java programs\\SeleniumTraining\\src\\test\\java\\element.png");
		FileUtils.copyFile(src, dest);
		
		Thread.sleep(3000);
		
		//driver.quit();
		
		

	}

}
