package Z_23_relative_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_05_near {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Index.html");
		
		try {
		
		WebElement email=driver.findElement((By.xpath("//input[@id='email']")));
		
		System.out.println("email found");
		
		WebElement arrowicon=driver.findElement(RelativeLocator.with(By.tagName("img")).near(email));
		
		System.out.println("arrowicon found");
		Thread.sleep(4000);

		arrowicon.click();
		System.out.println("arrow icon clicked");

		Thread.sleep(4000);
		
		}
		
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("skipped try block");
		}
		
		finally {
			driver.quit();
		}
	}

}
