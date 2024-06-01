package Z_96_practice_waits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.bouncycastle.util.Exceptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_04_practice_all_waits {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.firefoxdriver().setup();

	        FirefoxDriver driver = new FirefoxDriver();

	        driver.get("https://demo.automationtesting.in/Register.html");
	        driver.manage().window().maximize();

			WebElement home=driver.findElement(By.xpath("//a[normalize-space()='Home']"));

			FluentWait<FirefoxDriver> fluentwait=new FluentWait<FirefoxDriver>(driver);
			fluentwait.withTimeout(Duration.ofMillis(10000));
			fluentwait.pollingEvery(Duration.ofMillis(3000));
			fluentwait.ignoring(NoSuchElementException.class);
			
			
			Thread.sleep(3000);
			driver.quit();

	}

}
