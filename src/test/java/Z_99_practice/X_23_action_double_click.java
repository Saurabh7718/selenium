package Z_99_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_23_action_double_click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement doubleClick=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(doubleClick).doubleClick().build().perform();
		
		
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		
		
		driver.quit();
	}

}
