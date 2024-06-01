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

public class X_02_section_screenshot extends selenium_grid {
@Test
	public static void testTakeScreenshot() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
//
//		ChromeDriver driver=new ChromeDriver();
//
//		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Charts.html");

		WebElement section=driver.findElement(By.xpath("//div[@id='line-chart-widget']//div[@class='panel-footer']"));

		TakesScreenshot ts=(TakesScreenshot)driver;

		File src=section.getScreenshotAs(OutputType.FILE);

		File des=new File("D:\\java programs\\SeleniumTraining\\src\\test\\java\\section1.png");
		
		FileUtils.copyFile(src,des);
		
		Thread.sleep(3000);
		//driver.quit();

	}

}
