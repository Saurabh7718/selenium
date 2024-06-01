package Z_99_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_26_action_keyboard_methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement skills=driver.findElement(By.xpath("//select[@id='Skills']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(skills).click().build().perform();
		
		//(1) ArrowDOwn
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);


		//(2) ArrowUP
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000); 
		
		//(3)Enter
		//act.sendKeys(Keys.ENTER).perform();
		
		//(4) END
		act.sendKeys(Keys.END).perform();
		
		
		Thread.sleep(2000);
		
		//(5)HOME
		act.sendKeys(Keys.HOME).perform();
		
		Thread.sleep(2000);

		driver.quit();

	}

}
