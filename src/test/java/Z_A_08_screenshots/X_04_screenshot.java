package Z_A_08_screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_04_screenshot {
	@Test
	public void screenshot() throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File dest=new File("D:\\java programs\\SeleniumTraining\\src\\test\\java\\element.png");
		WebElement element=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]"));
		
		File src=element.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, dest);
		
		Thread.sleep(4000);
		

		driver.quit();
		
				
	}

}
