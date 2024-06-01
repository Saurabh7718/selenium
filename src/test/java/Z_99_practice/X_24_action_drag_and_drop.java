package Z_99_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_24_action_drag_and_drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement src=driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		
		WebElement dest=driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		
		WebElement placeHolder=driver.findElement(By.xpath("//li[contains(text(),'BANK')]"));
		
		Actions act=new Actions(driver);
		//(1)first way
		//act.dragAndDrop(src, dest).build().perform();
		
		//(2) second way
		act.moveToElement(src).clickAndHold().moveToElement(dest).release().build().perform();
		
		 
		
		Thread.sleep(4000);
		driver.quit();

	}

}
