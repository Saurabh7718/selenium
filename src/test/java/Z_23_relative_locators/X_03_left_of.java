package Z_23_relative_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_03_left_of {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Index.html");
		
		try {
		
		WebElement skipSignIn=driver.findElement((By.xpath("//button[@id='btn2']")));
		
		System.out.println("skip sign in found");
		
		WebElement signIn=driver.findElement(RelativeLocator.with(By.tagName("button")).toLeftOf(skipSignIn));
		
		System.out.println("sign in found");
		Thread.sleep(4000);

		signIn.click();

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
