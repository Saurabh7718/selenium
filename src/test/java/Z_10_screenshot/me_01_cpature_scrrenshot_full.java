package Z_10_screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_01_cpature_scrrenshot_full {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		// full page screenshot

		/*
		 * TakesScreenshot ts=(TakesScreenshot)driver;
		 * 
		 * File src=ts.getScreenshotAs(OutputType.FILE);
		 * 
		 * //creating location in local system 
		 * File trg=new File("C:\\Users\\91883\\Documents\\saurabh_code\\TESTING\\home.png");
		 * 
		 * //copy source file into target file
		 * 
		 * FileUtils.copyFile(src,trg);
		 * 
		 */
		// Take screenshot of particular section
		WebElement section = driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]"));
		File src1 = section.getScreenshotAs(OutputType.FILE);

		// creating location in local system
		File trg = new File("D:\\java programs\\SeleniumTraining\\src\\test\\java\\section.jpg");

		// copy source file into target file

		FileUtils.copyFile(src1, trg);
 
		
		
		
		//Takescreenshot of particular element
		WebElement element=driver.findElement(By.xpath( "//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]"));
		
		File src=element.getScreenshotAs(OutputType.FILE);
		
		File tar=new File("\"C:\\\\Users\\\\91883\\\\Documents\\\\saurabh_code\\\\TESTING\\\\section.png\"");
		
		FileUtils.copyFile(src, tar);
		
		
		
		driver.quit();
	}

}
