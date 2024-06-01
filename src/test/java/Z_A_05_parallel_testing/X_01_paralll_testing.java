package Z_A_05_parallel_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_01_paralll_testing {
	WebDriver driver;
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test 
	public void method1() {
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("sam");
		System.out.println("Thread id: " + Thread.currentThread().getId());
        System.out.println("Page title: " + driver.getTitle());
		
	}
	
	@Test 
	public void method2() {
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("curran");
		System.out.println("Thread id: " + Thread.currentThread().getId());
        System.out.println("Page title: " + driver.getTitle());
		
	}
	
	@AfterClass
	public void teardown() {
		if(driver!=null) {
			driver.close();
			driver.quit();
			
		}
	}

}
