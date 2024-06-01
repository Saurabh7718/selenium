package Z_90_testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_10_practice {
	WebDriver driver;
	@BeforeTest
	void setupdriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	@BeforeClass
	void url() {
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
	}
	
	@Test(priority=0,enabled=true,groups="reg",dependsOnMethods="tryit")
	void logotest() {
		driver.findElement(By.xpath( "//body/div[3]/a[1]/i[1]"));
		System.out.println("logotest");
	}
	@Test(priority=1)
	void tryit() {
		driver.findElement(By.xpath( "//body/div[@id='main']/div[3]/div[1]/div[2]/div[1]/a[1]")).click();
		System.out.println("tryit");
	}
	@AfterClass
	void close() {
		driver.close();
		
	}
	@AfterTest
	void quit() {
		driver.quit();
	}
	
}
