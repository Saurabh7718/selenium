package Z_13_upload_files;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_01_upload_files {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.foundit.in/seeker/registration?spl=IN-Acq-SEM-Google-IP_IN_SER_Monster_Brand_Exact_17052022-GSN-Monster-monster%20india-Both-Brand---637202008768---CPC-6645446156&utm_campaign=IN_Acq_SEM-Google-IP_IN_SER_Monster_Brand_Exact_17052022-GSN-Monster-monster%20india-&utm_medium=SEM&utm_source=Google-GSN-CPC&utm_term=SEM_monster%20india&gclid=CjwKCAiAjPyfBhBMEiwAB2CCIudQgaRTnv94Yf5bKsNHYEtk3Rt8gMuSWSLtOqmLLptprEAqyCgh3RoCZpUQAvD_BwE");

		// using sendkeys method
		driver.manage().window().maximize();

		/*
		 * driver.findElement(By.xpath(
		 * "//span[contains(text(),'Choose CV')]")).click();
		 * driver.findElement(By.xpath(
		 * "//span[contains(text(),'Choose CV')]")).sendKeys(
		 * "c:\\seleniumpratice\\sample.pdf");
		 */

		// using robot class method
		WebElement btn = driver.findElement(By.xpath("//span[contains(text(),'Choose CV')]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", btn);
		
		/*
		 * 1)copy the path
		 * 2)ctrl + v
		 * 3)enter
		 * 
		 * 
		 */
		
		Robot rb=new Robot();
		rb.delay(1000);
		
	}

}
