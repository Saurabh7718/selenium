package Z_99_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_11_xpath_methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Index.html");
		
		//contains method
		driver.findElement(By.xpath("//button[contains(@id,'btn1')]")).click();
		
		driver.navigate().back();
		
		//by text function
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		
		//by index
		
		driver.findElement(By.xpath("//input[contains(@class,'txtbox') and @type='password'][1]")).sendKeys("ABC");
		//input[contains(@class,'txtbox') and @type='password'][1]
	
		
		//by starts-with
		driver.navigate().back();
		driver.findElement(By.xpath("//button[starts-with(normalize-space(),'Sign In')]")).click();
		
		
		
		Thread.sleep(4000);
		
		driver.quit();
		
	}

}
