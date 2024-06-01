package Z_23_relative_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_04_torightof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Index.html");
		
		try {
		
		WebElement signIn=driver.findElement((By.xpath("//button[@id='btn1']")));
		
		System.out.println("sign in found");
		
		WebElement skipSignIn=driver.findElement(RelativeLocator.with(By.tagName("button")).toRightOf(signIn));
		
		System.out.println("skip sign in found");
		Thread.sleep(4000);

		skipSignIn.click();
		System.out.println("skip sign in clicked");

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
