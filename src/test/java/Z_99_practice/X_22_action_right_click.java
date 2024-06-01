package Z_99_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_22_action_right_click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rightClick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(rightClick).contextClick().build().perform();
		Thread.sleep(2000);

		act.sendKeys(Keys.ARROW_DOWN).click().build().perform();
		
		Thread.sleep(4000);
		//driver.switchTo().alert().accept();
		
		//Thread.sleep(4000);
		driver.quit();

	}

}
