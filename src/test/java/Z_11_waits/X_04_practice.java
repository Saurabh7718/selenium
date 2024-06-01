package Z_11_waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_04_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement table=driver.findElement(By.xpath("//a[normalize-space()='WebTable']"));
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		
		FluentWait<ChromeDriver> wait=new FluentWait<ChromeDriver>(driver);
		
		wait.pollingEvery(Duration.ofMillis(4000));
		wait.ignoring(ArithmeticException.class);
		wait.until(ExpectedConditions.visibilityOf(table));
		
		
		System.out.println("fluent wait");
		Thread.sleep(4000);
		
		driver.quit();
		
		
		

	}

}
