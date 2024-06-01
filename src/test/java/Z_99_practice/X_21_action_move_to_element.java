package Z_99_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_21_action_move_to_element {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement mobile=driver.findElement(By.xpath("//img[@alt='Mobiles']"));
		Actions act=new Actions(driver);
		
		act.moveToElement(mobile).click().build().perform();
		
		
		
		Thread.sleep(4000);
		driver.quit();
		
		

	}

}
