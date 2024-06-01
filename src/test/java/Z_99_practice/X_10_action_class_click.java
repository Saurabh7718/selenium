package Z_99_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_10_action_class_click {
	public static void main(String [] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Index.html");
		
		WebElement arrow=driver.findElement(By.xpath("//img[@id='enterimg']"));
		
		Actions act=new Actions(driver);
		Thread.sleep(4000);
		
		act.moveToElement(arrow).click().build().perform();
		
		Thread.sleep(4000);
		
		driver.quit();
		
	}

}
